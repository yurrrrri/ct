package com.ll.level0.p120841;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {
    @Test
    @DisplayName("2, 4 => 1")
    void t1() {
        int[] dots = {2, 4};
        assertThat(new Solution().solution(dots)).isEqualTo(1);
    }

    @Test
    @DisplayName("-7, 9 => 2")
    void t2() {
        int[] dots = {-7, 9};
        assertThat(new Solution().solution(dots)).isEqualTo(2);
    }
}
