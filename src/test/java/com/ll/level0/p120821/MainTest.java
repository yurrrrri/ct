package com.ll.level0.p120821;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {
    @Test
    void t1() {
        int[] num_list = {1, 2, 3, 4, 5};
        int[] result = {5, 4, 3, 2, 1};
        assertThat(new Solution().solution(num_list)).isEqualTo(result);
    }

    @Test
    void t2() {
        int[] num_list = {1, 1, 1, 1, 1, 2};
        int[] result = {2, 1, 1, 1, 1, 1};
        assertThat(new Solution().solution(num_list)).isEqualTo(result);
    }

    @Test
    void t3() {
        int[] num_list = {1, 0, 1, 1, 1, 3, 5};
        int[] result = {5, 3, 1, 1, 1, 0, 1};
        assertThat(new Solution().solution(num_list)).isEqualTo(result);
    }
}
