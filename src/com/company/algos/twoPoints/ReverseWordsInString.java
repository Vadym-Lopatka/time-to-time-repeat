package com.company.algos.twoPoints;

public class ReverseWordsInString {
    public static void main(String[] args) {
        var input = "Hello, the greatest people!";
        var expected = ",olleH eht tsetaerg !elpoep";

        System.out.println(reverse(input).equals(expected));
    }

    private static String reverse(String input) {
        int l = 0, r;

        char t;
        char[] arr = input.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ' || isCursorOnLastElementOfArray(i, arr)) {
                r = isCursorOnLastElementOfArray(i, arr) ? i : i - 1;
                while (l < r) {
                    t = arr[l];
                    arr[l] = arr[r];
                    arr[r] = t;
                    r--;
                    l++;
                }

                l = i + 1;
            }
        }

        return new String(arr);
    }

    private static boolean isCursorOnLastElementOfArray(int i, char[] arr) {
        return i == arr.length - 1;
    }
}
