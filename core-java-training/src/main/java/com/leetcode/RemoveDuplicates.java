package com.leetcode;

/**
 * Remove duplicates from sorted list of array.
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array1 = {1, 1, 2, 3, 4, 4, 4, 5, 6, 7, 8, 9, 10, 11, 11};
        System.out.println("Size of list after eliminating duplicates: " + removeDuplicates(array1, array1.length));
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int n = removeDuplicates(arr, arr.length);
        // Print updated array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static int removeDuplicates(int[] nums, int n) {
        //Check if the size of the list is 0 or 1
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0; //Maintains the index.
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] != nums[i + 1]) {
                nums[j++] = nums[i];
            }
        }
        nums[j++] = nums[n - 1];
        return j;
    }
}
