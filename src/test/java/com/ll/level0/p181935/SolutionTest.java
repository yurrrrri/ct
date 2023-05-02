package com.ll.level0.p181935;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    void t001() {
        assertThat(new Solution().solution(7)).isEqualTo(16);
    }

    @Test
    void t002() {
        assertThat(new Solution().solution(10)).isEqualTo(220);
    }
}
