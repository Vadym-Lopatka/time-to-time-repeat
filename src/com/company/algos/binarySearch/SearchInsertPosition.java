package com.company.algos.binarySearch;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        int target = 7;
        int expected = 4;

        System.out.println(searchInsert(nums,target) == expected);
    }

    private static int searchInsert(int[] nums, int target) {
        int pivot, left = 0, right = nums.length - 1;

        while (left <= right) {
            pivot = left + (right - left) / 2;

            if (nums[pivot] == target)
                return pivot;
            else {
                if (target < nums[pivot]) {
                    right = pivot - 1;
                } else {
                    left = pivot + 1;
                }
            }
        }

        return left;
    }
}
