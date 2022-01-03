package com.company.algos.slidingWindow;

import java.util.HashMap;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        var input = "pwwkew";
        var expected = 3;
        var result = lengthOfLongestSubstring(input);

        System.out.println(result == expected);

    }

    private static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>(s.length());
        int start = 0, len = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (map.containsKey(c)) {
                if (map.get(c) >= start) {
                    start = map.get(c) + 1;
                }
            }

            len = Math.max(len, i - start + 1);
            map.put(c, i);
        }

        return len;
    }
}
