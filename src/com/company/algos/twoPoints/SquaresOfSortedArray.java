package com.company.algos.twoPoints;

import java.util.Arrays;

public class SquaresOfSortedArray {

    // Given an integer array nums sorted in non-decreasing order,
    // return an array of the squares of each number sorted in non-decreasing order.
    public static void main(String[] args) {
        int[] ints = {-7, -4, 2, 4, 10};
        int[] expected = {4, 16, 16, 49, 100};

        System.out.println(Arrays.equals(sortedSquares(ints), expected));
    }

    private static int[] sortedSquares(int[] ints) {

        int square, left = 0;
        int right = ints.length - 1;
        int[] result = new int[ints.length];

        for (int i = ints.length - 1; i >= 0; i--) {
            if (Math.abs(ints[left]) > Math.abs(ints[right])) {
                square = ints[left] * ints[left];
                left++;
            } else {
                square = ints[right] * ints[right];
                right--;
            }
            result[i] = square;
        }

        return result;
    }
}
