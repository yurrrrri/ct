package com.ll.level0.p120831;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    @Test
    @DisplayName("10 => 30")
    void t1() {
        assertThat(new Solution().solution(10)).isEqualTo(30);
    }

    @Test
    @DisplayName("4 => 6")
    void t2() {
        assertThat(new Solution().solution(4)).isEqualTo(6);
    }
}
