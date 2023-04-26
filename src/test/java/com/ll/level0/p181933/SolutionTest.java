package com.ll.level0.p181933;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    void t001() {
        assertThat(new Solution().solution(-4, 7, true)).isEqualTo(3);
    }

    @Test
    void t002() {
        assertThat(new Solution().solution(-4, 7, false)).isEqualTo(-11);
    }
}
