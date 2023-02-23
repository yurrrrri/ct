package com.ll.level0.p120805;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    @DisplayName("10, 5 => 2")
    void t1(){
        assertThat(new Solution().solution(10, 5)).isEqualTo(2);
    }

    @Test
    @DisplayName("7, 2=> 3")
    void t2(){
        assertThat(new Solution().solution(7, 2)).isEqualTo(3);
    }
}