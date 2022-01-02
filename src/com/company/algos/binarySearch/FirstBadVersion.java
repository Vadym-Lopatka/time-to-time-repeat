package com.company.algos.binarySearch;

public class FirstBadVersion {

    // given a stream of versions
    // each next version is based on previous one
    // all versions after the first broken one are also broken

    // the task is to find the first broken version
    private static int first_bad_version = -1;

    public static void main(String[] args) {
        first_bad_version = 3;
        int result = findFirstBrokenVersion(10);
        int expected = 3;
        System.out.println(result == expected);
    }

    private static int findFirstBrokenVersion(int n) {
        int pivot, left = 1, right = n;

        while (left <= right) {
            pivot = left + (right - left) / 2;

            if (!isBrokenVersion(pivot)) {
                left = pivot + 1;
            } else {
                if (!isBrokenVersion(pivot - 1)) { // if previous not broken
                    return pivot;
                } else { // previous also broken
                    right = pivot - 1;
                }
            }
        }

        return -1;
    }

    private static boolean isBrokenVersion(int version) {
        return version >= first_bad_version;
    }
}
