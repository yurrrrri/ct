package com.ll.level0.p120814;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    void t1() {
        assertThat(new Solution().solution(7)).isEqualTo(1);
    }

    @Test
    void t2() {
        assertThat(new Solution().solution(1)).isEqualTo(1);
    }

    @Test
    void t3() {
        assertThat(new Solution().solution(15)).isEqualTo(3);
    }
}
