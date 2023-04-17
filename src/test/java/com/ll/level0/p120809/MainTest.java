package com.ll.level0.p120809;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {

    @Test
    void t1(){
        int[] numbers = {1, 2, 3, 4, 5};
        int[] result = {2, 4, 6, 8, 10};
        assertThat(new Solution().solution(numbers)).isEqualTo(result);
    }

    @Test
    void t2(){
        int[] numbers = {1, 2, 100, -99, 1, 2, 3};
        int[] result = {2, 4, 200, -198, 2, 4, 6};
        assertThat(new Solution().solution(numbers)).isEqualTo(result);
    }

}
