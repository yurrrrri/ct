package com.ll.level0.p120854;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {
    @Test
    @DisplayName("[2, 3, 3, 6]")
    void t1(){
        String[] strlist = {"We", "are", "the", "world!"};
        assertThat(new Solution().solution(strlist)).isEqualTo(new int[]{2, 3, 3, 6});
    }

    @Test
    @DisplayName("[1, 4, 12]")
    void t2(){
        String[] strlist = {"I", "Love", "Programmers."};
        assertThat(new Solution().solution(strlist)).isEqualTo(new int[]{1, 4, 12});
    }
}
