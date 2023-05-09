package com.ll.level0.p120862;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    @Test
    void t001(){
        int[] numbers = {1, 2, -3, 4, -5};
        assertThat(new Solution().solution(numbers)).isEqualTo(15);
    }

    @Test
    void t002(){
        int[] numbers = {0, -31, 24, 10, 1, 9};
        assertThat(new Solution().solution(numbers)).isEqualTo(240);
    }

    @Test
    void t003(){
        int[] numbers = {10, 20, 30, 5, 5, 20, 5};
        assertThat(new Solution().solution(numbers)).isEqualTo(600);
    }
}
