package com.ll.level1.p142086;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {
    @Test
    @DisplayName("banana")
    void t1() {
        int[] result = {-1, -1, -1, 2, 2, 2};
        assertThat(new Solution().solution("banana")).isEqualTo(result);
    }

    @Test
    @DisplayName("foobar")
    void t2() {
        int[] result = {-1, -1, 1, -1, -1, -1};
        assertThat(new Solution().solution("foobar")).isEqualTo(result);
    }
}
