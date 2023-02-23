package com.ll.p120804;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MainTest {
    @Test
    @DisplayName("3, 4 => 12")
    void t1(){
        assertThat(new Main().solution(3, 4)).isEqualTo(12);
    }

    @Test
    @DisplayName("27, 19 => 513")
    void t2(){
        assertThat(new Main().solution(27, 19)).isEqualTo(513);
    }
}
