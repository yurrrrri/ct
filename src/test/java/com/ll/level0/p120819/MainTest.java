package com.ll.level0.p120819;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {
    @Test
    void t1() {
        int[] result = {1, 0};
        assertThat(new Solution().solution(5500)).isEqualTo(result);
    }

    @Test
    void t2() {
        int[] result = {2, 4000};
        assertThat(new Solution().solution(15000)).isEqualTo(result);
    }
}
