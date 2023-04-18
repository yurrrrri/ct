package com.ll.level0.p120898;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {
    @Test
    void t1() {
        assertThat(new Solution().solution("happy birthday!")).isEqualTo(30);
    }

    @Test
    void t2() {
        assertThat(new Solution().solution("I love you~")).isEqualTo(22);
    }
}
