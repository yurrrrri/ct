package com.ll.level0.p181906;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    void t001() {
        assertThat(new Solution().solution("banana", "ban")).isEqualTo(1);
        assertThat(new Solution().solution("banana", "nan")).isEqualTo(0);
        assertThat(new Solution().solution("banana", "abcd")).isEqualTo(0);
        assertThat(new Solution().solution("banana", "bananan")).isEqualTo(0);
    }
}
