package com.ll.level0.p181937;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    @Test
    void t001() {
        assertThat(new Solution().solution(98, 2)).isEqualTo(1);
    }

    @Test
    void t002() {
        assertThat(new Solution().solution(34, 3)).isEqualTo(0);
    }
}
