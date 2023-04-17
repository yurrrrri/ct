package com.ll.level2.p87377;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {

    @Test
    void intersection1(){
        int[] line1 = {1, -1, 0};
        int[] line2 = {2, -1, 0};
        assertThat(new Solution().intersection(line1, line2)).isEqualTo(Point.of(0, 0));
    }

    @Test
    void t1(){
        int[][] numbers = {{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}};
        String[] result = {"....*....", ".........", ".........", "*.......*", ".........", ".........", ".........", ".........", "*.......*"};
        assertThat(new Solution().solution(numbers)).isEqualTo(result);
    }

    @Test
    void t2(){
        int[][] numbers = {{0, 1, -1}, {1, 0, -1}, {1, 0, 1}};
        String[] result = {"*.*"};
        assertThat(new Solution().solution(numbers)).isEqualTo(result);
    }

    @Test
    void t3(){
        int[][] numbers = {{1, -1, 0}, {2, -1, 0}};
        String[] result = {"*"};
        assertThat(new Solution().solution(numbers)).isEqualTo(result);
    }

    @Test
    void t4(){
        int[][] numbers = {{1, -1, 0}, {2, -1, 0}, {4, -1, 0}};
        String[] result = {"*"};
        assertThat(new Solution().solution(numbers)).isEqualTo(result);
    }
}
