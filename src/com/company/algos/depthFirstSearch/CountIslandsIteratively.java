package com.company.algos.depthFirstSearch;

import java.util.Stack;

public class CountIslandsIteratively {

    public static void main(String[] args) {
        // island == "1" connected 4-directionally
        // 0 == water
        var inputArea = new int[][]{
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };

        var expectedNumberOfIslands = 6;
        System.out.println(countIslands(inputArea) == expectedNumberOfIslands);
    }

    private static int countIslands(int[][] area) {
        boolean[][] visited = new boolean[area.length][area[0].length];
        int[] dr = new int[]{1, -1, 0, 0};
        int[] dc = new int[]{0, 0, 1, -1};

        int ans = 0;
        for (int r0 = 0; r0 < area.length; r0++) {
            for (int c0 = 0; c0 < area[0].length; c0++) {
                if (area[r0][c0] == 1 && !visited[r0][c0]) {
                    int shape = 0;
                    Stack<int[]> stack = new Stack<>();
                    stack.push(new int[]{r0, c0});
                    visited[r0][c0] = true;
                    while (!stack.empty()) {
                        int[] node = stack.pop();
                        int r = node[0], c = node[1];
                        shape++;
                        for (int k = 0; k < 4; k++) {
                            int nr = r + dr[k];
                            int nc = c + dc[k];
                            if (0 <= nr && nr < area.length &&
                                    0 <= nc && nc < area[0].length &&
                                    area[nr][nc] == 1 && !visited[nr][nc]) {
                                stack.push(new int[]{nr, nc});
                                visited[nr][nc] = true;
                            }
                        }
                    }
                    ans = Math.max(ans, shape);
                }
            }
        }

        return ans;
    }
}
