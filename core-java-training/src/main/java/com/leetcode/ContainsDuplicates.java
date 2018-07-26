package com.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Checks if the given array has duplicate elements.
 */
public class ContainsDuplicates {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        System.out.println(" " + containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int i : nums) {
            if (numSet.contains(i))
                return true;
            numSet.add(i);
        }
        return false;
    }

}
