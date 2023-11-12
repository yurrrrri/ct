package com.ll.level2.p81302;

import java.util.*;

public class Main {
}

class Solution {
    class Point {
        int row, col, dtc;

        Point(int row, int col, int dtc) {
            this.row = row;
            this.col = col;
            this.dtc = dtc;
        }
    }

    private static final int[][] D = {{1,0}, {-1,0}, {0,1}, {0,-1}};

    private boolean bfs(String[] place, int x, int y) {
        boolean[][] visited = new boolean[5][5];

        Queue<Point> q = new LinkedList<>();
        visited[x][y] = true;
        q.add(new Point(x, y, 0));

        while (!q.isEmpty()) {
            Point curr = q.remove();

            if (curr.dtc > 2) continue;
            if (curr.dtc != 0 && place[curr.row].charAt(curr.col) == 'P') {
                return false;
            }

            for (int i = 0; i < 4; i++) {
                int nx = curr.row + D[i][0];
                int ny = curr.col + D[i][1];

                if (nx < 0 || nx > 4 || ny < 0 || ny > 4) continue;
                if (visited[nx][ny]) continue;
                if (place[nx].charAt(ny) == 'X') continue;
                visited[nx][ny] = true;
                q.add(new Point(nx, ny, curr.dtc + 1));
            }
        }
        return true;
    }

    private boolean check(String[] place) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (place[i].charAt(j) == 'P') {
                    if (!bfs(place, i, j))
                        return false;
                }
            }
        }
        return true;
    }

    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = check(places[i]) ? 1 : 0;
        }

        return answer;
    }
}