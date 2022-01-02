package com.company.algos.binarySearch;

public class BinarySearch {

    // find the index of target in nums or return -1
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;

        int expected = 4;
        System.out.println(search(nums, target) == expected);
    }

    private static int search(int[] nums, int target) {
        int pivot, left = 0, right = nums.length - 1;

        while (left <= right) {
            pivot = left + (right - left) / 2;

            if (nums[pivot] == target)
                return pivot;

            if (target < nums[pivot])
                right = pivot - 1;
            else
                left = pivot + 1;
        }

        return -1;
    }
}
