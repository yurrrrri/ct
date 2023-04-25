package com.ll.level1.p42862;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    void t001() {
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        assertThat(new Solution().solution(5, lost, reserve)).isEqualTo(5);
    }

    @Test
    void t002() {
        int[] lost = {2, 4};
        int[] reserve = {3};
        assertThat(new Solution().solution(5, lost, reserve)).isEqualTo(4);
    }

    @Test
    void t003() {
        int[] lost = {3};
        int[] reserve = {1};
        assertThat(new Solution().solution(3, lost, reserve)).isEqualTo(2);
    }
}
