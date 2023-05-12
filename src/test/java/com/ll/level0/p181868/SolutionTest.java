package com.ll.level0.p181868;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    @Test
    void t001(){
        String[] result = {"i", "love", "you"};
        assertThat(new Solution().solution(" i    love  you")).isEqualTo(result);
    }

    @Test
    void t002(){
        String[] result = {"programmers"};
        assertThat(new Solution().solution("    programmers  ")).isEqualTo(result);
    }
}
