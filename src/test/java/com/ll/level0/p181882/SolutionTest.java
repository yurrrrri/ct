package com.ll.level0.p181882;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    void t001() {
        int[] arr = {1, 2, 3, 100, 99, 98};
        int[] result = {2, 2, 6, 50, 99, 49};
        assertThat(new Solution().solution(arr)).isEqualTo(result);
    }
}
