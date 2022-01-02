package com.company.algos.twoPoints;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] input = {0, 3, 0, 4, 15};
        int[] expected = {3, 4, 15, 0, 0};

        moveZerosToEnd(input);
        System.out.println(Arrays.equals(input, expected));
    }

    private static void moveZerosToEnd(int[] nums) {
        if (nums.length < 2)
            return;

        int t = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0)
                t++;
            else {
                if (t != 0) {
                    nums[i - t] = nums[i];
                    nums[i] = 0;
                }
            }

        }
    }
}
