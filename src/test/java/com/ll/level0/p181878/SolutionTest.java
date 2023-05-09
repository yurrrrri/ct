package com.ll.level0.p181878;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    @Test
    void t001(){
        assertThat(new Solution().solution("AbCdEfG", "aBc")).isEqualTo(1);
        assertThat(new Solution().solution("aaAA", "aaaaa")).isEqualTo(0);
    }
}
