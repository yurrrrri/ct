package com.ll.level1.p12906;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    void t001() {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] answer = {1, 3, 0, 1};
        assertThat(new Solution().solution(arr)).isEqualTo(answer);
    }

    @Test
    void t002() {
        int[] arr = {4, 4, 4, 3, 3};
        int[] answer = {4, 3};
        assertThat(new Solution().solution(arr)).isEqualTo(answer);
    }

}
