package com.ll.level0.p181887;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    void t001() {
        assertThat(new Solution().solution(new int[]{4, 2, 6, 1, 7, 6})).isEqualTo(17);
        assertThat(new Solution().solution(new int[]{-1, 2, 5, 6, 3})).isEqualTo(8);
    }
}
