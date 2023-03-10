package com.ll.level0.p120820;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {
    @Test
    @DisplayName("40 => 1983")
    void t1(){
        assertThat(new Solution().solution(40)).isEqualTo(1983);
    }

    @Test
    @DisplayName("23 => 2000")
    void t2(){
        assertThat(new Solution().solution(23)).isEqualTo(2000);
    }
}
