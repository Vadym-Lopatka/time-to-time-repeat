package com.company.algos.depthFirstSearch;

import java.util.Arrays;

public class FloodFillRecursively {

    public static void main(String[] args) {
        var inputArr = new int[][]{
                new int[]{1, 1, 1},
                new int[]{1, 1, 0},
                new int[]{1, 0, 1}
        };
        var expected = new int[][]{
                new int[]{2, 2, 2},
                new int[]{2, 2, 0},
                new int[]{2, 0, 1}
        };

        System.out.println(Arrays.deepEquals(expected, floodFill(inputArr, 1, 1, 2)));
    }

    private static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        var color = image[sr][sc];
        if (color != newColor) {
            dfs(image, sr, sc, color, newColor);
        }
        return image;

    }

    private static void dfs(int[][] image, int r, int c, int color, int newColor) {
        if (image[r][c] == color) {
            image[r][c] = newColor;

            if (r >= 1) dfs(image, r - 1, c, color, newColor);
            if (c >= 1) dfs(image, r, c - 1, color, newColor);

            if (r < image.length - 1) dfs(image, r + 1, c, color, newColor);
            if (c < image.length - 1) dfs(image, r, c + 1, color, newColor);
        }
    }

}
