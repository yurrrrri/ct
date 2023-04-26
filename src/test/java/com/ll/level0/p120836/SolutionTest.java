package com.ll.level0.p120836;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    void t001() {
        assertThat(new Solution().solution(20)).isEqualTo(6);
    }

    @Test
    void t002() {
        assertThat(new Solution().solution(100)).isEqualTo(9);
    }

}
