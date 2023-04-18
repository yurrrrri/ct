package com.ll.level0.p120889;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {
    @Test
    @DisplayName("[1, 2, 3]")
    void t1() {
        int[] sides = {1, 2, 3};
        assertThat(new Solution().solution(sides)).isEqualTo(2);
    }

    @Test
    @DisplayName("[3, 6, 2]")
    void t2() {
        int[] sides = {3, 6, 2};
        assertThat(new Solution().solution(sides)).isEqualTo(2);
    }

    @Test
    @DisplayName("[199, 72, 222]")
    void t3() {
        int[] sides = {199, 72, 222};
        assertThat(new Solution().solution(sides)).isEqualTo(1);
    }
}
