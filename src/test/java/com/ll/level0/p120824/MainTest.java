package com.ll.level0.p120824;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {

    @Test
    void t1() {
        int[] num_list = {1, 2, 3, 4, 5};
        int[] result = {2, 3};
        assertThat(new Solution().solution(num_list)).isEqualTo(result);
    }

    @Test
    void t2() {
        int[] num_list = {1, 3, 5, 7};
        int[] result = {0, 4};
        assertThat(new Solution().solution(num_list)).isEqualTo(result);
    }
}
