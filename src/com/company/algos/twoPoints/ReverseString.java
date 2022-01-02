package com.company.algos.twoPoints;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] arr = {'w', 'o', 'r', 'l', 'd'};

        reverseArr(arr);
        System.out.println(Arrays.equals(arr, new char[]{'d', 'l', 'r', 'o', 'w'}));
    }

    private static void reverseArr(char[] arr) {
        int l = 0, r = arr.length - 1;
        char t;

        while (l < r) {
            t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++;
            r--;
        }
    }
}
