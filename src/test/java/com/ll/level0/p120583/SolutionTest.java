package com.ll.level0.p120583;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    @Test
    @DisplayName("{1, 1, 2, 3, 4, 5} => 2")
    void t1() {
        int[] array = {1, 1, 2, 3, 4, 5};
        assertThat(new Solution().solution(array, 1)).isEqualTo(2);
    }

    @Test
    @DisplayName("{0, 2, 3, 4} => 0")
    void t2() {
        int[] array = {0, 2, 3, 4};
        assertThat(new Solution().solution(array, 1)).isEqualTo(0);
    }
}
