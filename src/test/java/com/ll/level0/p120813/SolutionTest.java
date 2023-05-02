package com.ll.level0.p120813;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    void t001() {
        int[] result = {1, 3, 5, 7, 9};
        assertThat(new Solution().solution(10));
    }

    @Test
    void t002() {
        int[] result = {1, 3, 5, 7, 9, 11, 13, 15};
        assertThat(new Solution().solution(15));
    }
}
