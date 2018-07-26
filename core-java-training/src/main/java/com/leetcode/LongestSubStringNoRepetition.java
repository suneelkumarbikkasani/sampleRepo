package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubStringNoRepetition {
    /**
     * @param s
     * @return
     */
    static int lengthLongestSubStringUsingSetOptimized(String s) {
        int result = 0;
        if (s == null || s.length() < 1)
            return result;

        Set<Character> set = new HashSet<>();
        int i = 0, j = 0;
        while (i < s.length() && j < s.length()) {

            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                result = Math.max(result, j - i);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }

        return result;
    }

    static int lengthLongestSubStringUsingMap(String s) {
        int result = 0;
        if (s == null || s.length() < 1)
            return result;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0, j = 0; j < s.length(); j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            result = Math.max(result, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int max1 = lengthLongestSubStringUsingSetOptimized("abc");
        System.out.println("max1: " + max1);

        int max2 = lengthLongestSubStringUsingSetOptimized("abcabcdabcdeabcdefabcdefgh");
        System.out.println("max2: " + max2);

        int max22 = lengthLongestSubStringUsingMap("abcabcdabcdeabcdefabcdefgh");
        System.out.println("max22: " + max22);

        int max23 = lengthLongestSubStringUsingMap("abcdefghgzxytruizr");
        System.out.println("max23: " + max23);

        int max24 = lengthLongestSubStringUsingMap("au");
        System.out.println("max24: " + max24);
    }
}
