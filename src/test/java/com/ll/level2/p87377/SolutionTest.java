package com.ll.level2.p87377;

import com.ll.TestUt;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    void intersection() {
        int[] line1 = {1, -1, 0};
        int[] line2 = {2, -1, 0};
        assertThat((Point) TestUt.call(new Solution(), "intersection", line1, line2)).isEqualTo(Point.of(0, 0));
    }

    @Test
    void intersections() {
        int[][] line = {{1, -1, 0}, {2, -1, 0}, {4, -1, 0}};
        assertThat(new Solution().intersections(line)).isEqualTo(Points.of(Point.of(0, 0)));
    }

    @Test
    void getMinPoint() {
        assertThat(Points.of(Point.of(1, -1), Point.of(-1, 1)).getMinPoint()).isEqualTo(Point.of(-1, -1));
    }

    @Test
    void getMaxPoint() {
        assertThat(Points.of(Point.of(4, -1), Point.of(-1, 6)).getMaxPoint()).isEqualTo(Point.of(4, 6));
    }

    @Test
    void emptyMatrix() {
        assertThat(Points.of(Point.of(1, 1), Point.of(-1, 1)).emptyMatrix())
                .isEqualTo(new char[][]{{'.', '.', '.'}});
    }

    @Test
    void positivePoints() {
        assertThat(Points.of(Point.of(4, -7), Point.of(-1, 6)).positivePoints()).isEqualTo(Points.of(Point.of(5, 0), Point.of(0, 13)));
    }

    @Test
    void transformToMatrix() {
        assertThat(Points.of(Point.of(1, 1), Point.of(-1, 1)).toMatrix())
                .isEqualTo(new char[][]{{'*', '.', '*'}});
    }

    @Test
    void drawOnCoordinate() {
        assertThat(new Solution().drawOnCoordinate(new char[][]{{'*', '.'}, {'.', '*'}}))
                .isEqualTo(new String[]{".*", "*."});
    }

    @Test
    void t1() {
        int[][] numbers = {{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}};
        String[] result = {"....*....", ".........", ".........", "*.......*", ".........", ".........", ".........", ".........", "*.......*"};
        assertThat(new Solution().solution(numbers)).isEqualTo(result);
    }

    @Test
    void t2() {
        int[][] numbers = {{0, 1, -1}, {1, 0, -1}, {1, 0, 1}};
        String[] result = {"*.*"};
        assertThat(new Solution().solution(numbers)).isEqualTo(result);
    }

    @Test
    void t3() {
        int[][] numbers = {{1, -1, 0}, {2, -1, 0}};
        String[] result = {"*"};
        assertThat(new Solution().solution(numbers)).isEqualTo(result);
    }

    @Test
    void t4() {
        int[][] numbers = {{1, -1, 0}, {2, -1, 0}, {4, -1, 0}};
        String[] result = {"*"};
        assertThat(new Solution().solution(numbers)).isEqualTo(result);
    }
}
