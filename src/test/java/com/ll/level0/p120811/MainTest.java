package com.ll.level0.p120811;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {

    @Test
    void t1() {
        int[] array = {1, 2, 7, 10, 11};
        assertThat(new Solution().solution(array)).isEqualTo(7);
    }

    @Test
    void t2() {
        int[] array = {9, -1, 0};
        assertThat(new Solution().solution(array)).isEqualTo(0);
    }
}
