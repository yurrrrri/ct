package com.ll.level1.p12915;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {
    @Test
    @DisplayName("car, bed, sun")
    void t1(){
        String[] strings = {"sun", "bed", "car"};
        String[] result = {"car", "bed", "sun"};
        assertThat(new Solution().solution(strings, 1)).isEqualTo(result);
    }

    @Test
    @DisplayName("abcd, abce, cdx")
    void t2(){
        String[] strings = {"abce", "abcd", "cdx"};
        String[] result = {"abcd", "abce", "cdx"};
        assertThat(new Solution().solution(strings, 2)).isEqualTo(result);
    }
}
