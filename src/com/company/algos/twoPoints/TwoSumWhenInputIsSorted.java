package com.company.algos.twoPoints;

import java.util.Arrays;

public class TwoSumWhenInputIsSorted {
    public static void main(String[] args) {
        int[] numbers = {3, 24, 50, 79, 88, 150, 345};
        int target = 200;

        int[] result = findTwoSum(numbers, target);

        System.out.println(Arrays.toString(result));

    }

    private static int[] findTwoSum(int[] numbers, int target) {
        int sum, l = 0, r = numbers.length-1;

        while (l < r) {
            sum = numbers[l] + numbers[r];

            if (sum == target) {
                return new int[]{l + 1, r + 1};
            } else if (sum<target) {
                ++l;
            } else {
                --r;
            }
        }

        return new int[0];
    }
}
