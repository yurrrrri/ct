package com.ll.level0.p181884;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    void t001() {
        int[] numbers = {34, 5, 71, 29, 100, 34};
        assertThat(new Solution().solution(numbers, 123)).isEqualTo(139);
    }

    @Test
    void t002() {
        int[] numbers = {58, 44, 27, 10, 100};
        assertThat(new Solution().solution(numbers, 139)).isEqualTo(239);
    }

}
