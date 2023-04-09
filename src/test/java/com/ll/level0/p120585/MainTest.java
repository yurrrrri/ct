package com.ll.level0.p120585;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {
    @Test
    void t1(){
        int[] array = {149, 180, 192, 170};
        assertThat(new Solution().solution(array, 167)).isEqualTo(3);
    }

    @Test
    void t2(){
        int[] array = {180, 120, 140};
        assertThat(new Solution().solution(array, 190)).isEqualTo(0);
    }
}
