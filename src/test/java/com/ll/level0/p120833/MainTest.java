package com.ll.level0.p120833;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {

    @Test
    void t1() {
        int[] array = {1, 2, 3, 4, 5};
        int[] result = {2, 3, 4};
        assertThat(new Solution().solution(array, 1, 3)).isEqualTo(result);
    }

    @Test
    void t2() {
        int[] array = {1, 3, 5};
        int[] result = {3, 5};
        assertThat(new Solution().solution(array, 1, 2)).isEqualTo(result);
    }
}
