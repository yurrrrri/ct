package com.ll.level0.p181892;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    void t001() {
        int[] num_list = {2, 1, 6};
        assertThat(new Solution().solution(num_list, 3)).isEqualTo(new int[]{6});
    }

    @Test
    void t002() {
        int[] num_list = {5, 2, 1, 7, 5};
        assertThat(new Solution().solution(num_list, 2)).isEqualTo(new int[]{2, 1, 7, 5});
    }

}
