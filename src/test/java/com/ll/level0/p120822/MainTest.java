package com.ll.level0.p120822;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {
    @Test
    @DisplayName("40 => 1983")
    void t1(){

        assertThat(new Solution().solution("jaron")).isEqualTo("noraj");
    }

    @Test
    @DisplayName("23 => 2000")
    void t2(){
        assertThat(new Solution().solution("bread")).isEqualTo("daerb");
    }
}
