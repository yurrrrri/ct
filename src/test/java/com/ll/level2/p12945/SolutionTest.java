package com.ll.level2.p12945;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    void t001() {
        assertThat(new Solution().solution(3)).isEqualTo(2);
    }

    @Test
    void t002() {
        assertThat(new Solution().solution(5)).isEqualTo(5);
    }
}
