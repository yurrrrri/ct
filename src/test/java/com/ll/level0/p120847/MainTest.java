package com.ll.level0.p120847;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {

    @Test
    void t1(){
        int[] array = {1, 2, 3, 4, 5};
        assertThat(new Solution().solution(array)).isEqualTo(20);
    }

    @Test
    void t2(){
        int[] array = {0, 31, 24, 10, 1, 9};
        assertThat(new Solution().solution(array)).isEqualTo(744);
    }
}
