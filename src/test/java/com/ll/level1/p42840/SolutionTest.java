package com.ll.level1.p42840;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    void t001() {
        assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5})).isEqualTo(new int[]{1});
    }

    @Test
    void t002() {
        assertThat(new Solution().solution(new int[]{1, 3, 2, 4, 2})).isEqualTo(new int[]{1, 2, 3});
    }
}
