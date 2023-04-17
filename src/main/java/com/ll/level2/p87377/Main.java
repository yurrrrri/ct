package com.ll.level2.p87377;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

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

    public Set<Point> intersections(int[][] line) {
        Set<Point> points = new HashSet<>();

        for(int i = 0; i < line.length; i++){
            for(int j = i+1; j < line.length; j++){
                int[] line1 = line[i];
                int[] line2 = line[j];

                Point point = intersection(line1, line2);
                if(point != null) points.add(point);
            }
        }

        return points;
    }

    public Point getMinPoint(Set<Point> points) {
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;

        for(Point point : points) {
            x = Math.min(x, point.x);
            y = Math.min(y, point.y);
        }

        return Point.of(x, y);
    }

    public Point getMaxPoint(Set<Point> points) {
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;

        for(Point point : points) {
            x = Math.max(x, point.x);
            y = Math.max(y, point.y);
        }

        return Point.of(x, y);
    }

    public char[][] emptyMatrix(Set<Point> points) {
        Point minPoint = getMinPoint(points);
        Point maxPoint = getMaxPoint(points);

        int width = (int)(maxPoint.x - minPoint.x + 1);
        int height = (int)(maxPoint.y - minPoint.y + 1);

        char[][] matrix = new char[height][width];
        Arrays.stream(matrix).forEach(row -> Arrays.fill(row, '.'));

        return matrix;
    }

    public Set<Point> positivePoints(Set<Point> points) {
        Point minPoint = getMinPoint(points);

        return points.stream()
                .map(p -> Point.of(p.x - minPoint.x, p.y - minPoint.y))
                .collect(Collectors.toSet());
    }

    public char[][] transformToMatrix(Set<Point> points) {
        char[][] matrix = emptyMatrix(points);
        points = positivePoints(points);

        points.forEach(p -> matrix[(int) p.y][(int) p.x] = '*');

        return matrix;
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

    @Override
    public int hashCode() {
        int result = (int) (x ^ (x >>> 32));
        result = 31 * result + (int) (y ^ (y >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}