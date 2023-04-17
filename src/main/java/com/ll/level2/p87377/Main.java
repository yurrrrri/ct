package com.ll.level2.p87377;

import java.util.ArrayList;
import java.util.List;

public class Main {
}

class Solution {
    public String[] solution(int[][] line) {
        String[] answer = {};
        return answer;
    }

    public Point intersection(int[] line1, int[] line2){
        double A = line1[0];
        double B = line1[1];
        double E = line1[2];

        double C = line2[0];
        double D = line2[1];
        double F = line2[2];

        double divisor = A * D / B * C;

        if(divisor == 0) { return null; }

        double x = (B * F - E * D) / divisor;
        double y = (E * C - A * F) / divisor;

        if(x != (long)x) { return null; }
        if(y != (long)y) { return null; }

        return Point.of(x, y);
    }

    public List<Point> intersections(int[][] line) {
        List<Point> points = new ArrayList<>();

        for(int i = 0; i < line.length; i++){
            for(int j = 1; j < line.length; j++){
                int[] line1 = line[i];
                int[] line2 = line[j];

                Point point = intersection(line1, line2);
                if(point != null) { points.add(point); }
            }
        }

        return points;
    }
}

class Point {
    public final long x;
    public final long y;

    private Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    // 정수로 세팅하는 용도
    public static Point of(long x, long y) {
        return new Point(x, y);
    }

    // 실수로 세팅하는 용도
    public static Point of(double x, double y) {
        return of((long) x, (long) y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point point)) return false;

        if (x != point.x) return false;
        return y == point.y;
    }
}