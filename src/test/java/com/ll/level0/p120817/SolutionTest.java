package com.ll.level0.p120817;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    @Test
    @DisplayName("5.5")
    void t1() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat(new Solution().solution(numbers)).isEqualTo(5.5);
    }

    @Test
    @DisplayName("94.0")
    void t2() {
        int[] numbers = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        assertThat(new Solution().solution(numbers)).isEqualTo(94.0);
    }
}
