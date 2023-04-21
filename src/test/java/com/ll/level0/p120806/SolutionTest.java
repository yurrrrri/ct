package com.ll.level0.p120806;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    @Test
    @DisplayName("3, 2 => 1500")
    void t1() {
        assertThat(new Solution().solution(3, 2)).isEqualTo(1500);
    }

    @Test
    @DisplayName("7, 3=> 2333")
    void t2() {
        assertThat(new Solution().solution(7, 3)).isEqualTo(2333);
    }
}