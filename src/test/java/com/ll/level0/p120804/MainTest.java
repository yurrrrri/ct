package com.ll.level0.p120804;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {
    @Test
    @DisplayName("3, 4 => 12")
    void t1() {
        assertThat(new com.ll.level0.p120804.Solution().solution(3, 4)).isEqualTo(12);
    }

    @Test
    @DisplayName("27, 19 => 513")
    void t2() {
        assertThat(new com.ll.level0.p120804.Solution().solution(27, 19)).isEqualTo(513);
    }
}
