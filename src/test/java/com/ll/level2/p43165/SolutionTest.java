package com.ll.level2.p43165;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    @Test
    void t001(){
        int[] numbers = {1, 1, 1, 1, 1};
        assertThat(new Solution().solution(numbers, 3)).isEqualTo(5);
    }

    @Test
    void t002(){
        int[] numbers = {4, 1, 2, 1};
        assertThat(new Solution().solution(numbers, 4)).isEqualTo(2);
    }
}
