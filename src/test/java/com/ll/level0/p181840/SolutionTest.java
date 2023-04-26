package com.ll.level0.p181840;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    void t001() {
        assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5}, 3)).isEqualTo(1);
    }

    @Test
    void t002() {
        assertThat(new Solution().solution(new int[]{15, 98, 23, 2, 15}, 20)).isEqualTo(0);
    }
}
