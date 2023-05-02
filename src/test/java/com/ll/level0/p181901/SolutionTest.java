package com.ll.level0.p181901;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    @Test
    void t001() {
        int[] result = {3, 6, 9};
        assertThat(new Solution().solution(10, 3)).isEqualTo(result);
    }

    @Test
    void t002() {
        int[] result = {5, 10, 15};
        assertThat(new Solution().solution(15, 5)).isEqualTo(result);
    }
}
