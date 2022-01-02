package com.company.algos.twoPoints;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {5, 6, 7, 1, 2, 3, 4};

        rotate(arr, 3);
        System.out.println(Arrays.equals(arr, expected));
    }

    /*
    This approach is based on the fact that when we rotate the array k times,
    K elements from the back end of the array come to the front and the rest of the elements from the front shift backwards.

    In this approach, we firstly reverse all the elements of the array.
    Then, reversing the first k elements followed by reversing the rest N-K elements gives us the required result.

    Let n=7n = 7n=7 and k=3k = 3k=3.

    Original List                   : 1 2 3 4 5 6 7
    After reversing all numbers     : 7 6 5 4 3 2 1
    After reversing first k numbers : 5 6 7 4 3 2 1
    After revering last n-k numbers : 5 6 7 1 2 3 4 --> Result

    time O(n), space O(1)
    * */
    private static void rotate(int[] arr, int times) {

        times %= arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, times - 1);
        reverse(arr, times, arr.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
