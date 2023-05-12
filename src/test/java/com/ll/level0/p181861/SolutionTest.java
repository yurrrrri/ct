package com.ll.level0.p181861;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    @Test
    void t001(){
        int[] result = {5, 5, 5, 5, 5, 1, 4, 4, 4, 4};
        assertThat(new Solution().solution(new int[]{5, 1, 4})).isEqualTo(result);
    }

    @Test
    void t002(){
        int[] result = {6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6};
        assertThat(new Solution().solution(new int[]{6, 6})).isEqualTo(result);
    }

    @Test
    void t003(){
        int[] result = {1};
        assertThat(new Solution().solution(new int[]{1})).isEqualTo(result);
    }
}
