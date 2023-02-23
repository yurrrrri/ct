package com.ll.p120829;

import com.ll.p120829.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MainTest {
    @Test
    @DisplayName("70 => 1")
    void t1(){
        assertThat(new Main().solution(70)).isEqualTo(1);
    }

    @Test
    @DisplayName("91 => 3")
    void t2(){
        assertThat(new Main().solution(91)).isEqualTo(3);
    }

    @Test
    @DisplayName("180 => 4")
    void t3(){
        assertThat(new Main().solution(180)).isEqualTo(4);
    }

    @Test
    @DisplayName("90 => 2")
    void t4(){
        assertThat(new Main().solution(90)).isEqualTo(2);
    }
}
