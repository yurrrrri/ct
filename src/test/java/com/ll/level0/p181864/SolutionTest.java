package com.ll.level0.p181864;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    @Test
    void t001(){
        assertThat(new Solution().solution("ABBAA", "AABB")).isEqualTo(1);
        assertThat(new Solution().solution("ABAB", "ABAB")).isEqualTo(0);
    }
}
