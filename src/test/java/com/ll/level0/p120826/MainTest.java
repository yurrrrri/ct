package com.ll.level0.p120826;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {

    @Test
    void t1() {
        assertThat(new Solution().solution("abcdef", "f")).isEqualTo("abcde");
    }

    @Test
    void t2() {
        assertThat(new Solution().solution("BCBdbe", "B")).isEqualTo("Cdbe");
    }
}
