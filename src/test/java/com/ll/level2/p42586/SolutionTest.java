package com.ll.level2.p42586;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    @Test
    void t001() {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        assertThat(new Solution().solution(progresses, speeds)).isEqualTo(new int[]{2, 1});
    }

    @Test
    void t002() {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        assertThat(new Solution().solution(progresses, speeds)).isEqualTo(new int[]{1, 3, 2});
    }
}
