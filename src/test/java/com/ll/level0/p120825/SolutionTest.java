package com.ll.level0.p120825;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    void t001() {
        assertThat(new Solution().solution("hello", 3)).isEqualTo(	"hhheeellllllooo");
    }
}
