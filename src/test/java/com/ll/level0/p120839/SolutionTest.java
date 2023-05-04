package com.ll.level0.p120839;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    void t001() {
        assertThat(new Solution().solution("2")).isEqualTo("0");
        assertThat(new Solution().solution("205")).isEqualTo("052");
    }
}
