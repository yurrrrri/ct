package com.ll.level1.p81301;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    @Test
    @DisplayName("1478")
    void t1() {
        assertThat(new Solution().solution("one4seveneight")).isEqualTo(1478);
    }

    @Test
    @DisplayName("234567")
    void t2() {
        assertThat(new Solution().solution("23four5six7")).isEqualTo(234567);
    }

    @Test
    @DisplayName("234567")
    void t3() {
        assertThat(new Solution().solution("2three45sixseven")).isEqualTo(234567);
    }

    @Test
    @DisplayName("123")
    void t4() {
        assertThat(new Solution().solution("123")).isEqualTo(123);
    }
}
