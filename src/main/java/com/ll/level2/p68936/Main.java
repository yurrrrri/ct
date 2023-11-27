package com.ll.level2.p68936;

public class Main {
}

class Solution {

    private static int[] answer = new int[2];

    public int[] solution(int[][] arr) {
        dq(0, 0, arr.length, arr);

        return answer;
    }

    private static void dq(int dx, int dy, int size, int[][] arr) {
        if (check(dx, dy, size, arr)) {
            answer[arr[dx][dy]]++;
            return;
        }

        dq(dx, dy, size / 2, arr);
        dq(dx + size / 2, dy, size / 2, arr);
        dq(dx, dy + size / 2, size / 2, arr);
        dq(dx + size / 2, dy + size / 2, size / 2, arr);
    }

    private static boolean check(int x, int y, int size, int[][] arr) {
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[i][j] != arr[x][y]) return false;
            }
        }

        return true;
    }
}
