package com.ll.level2.p42860;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    void t001() {
        assertThat(new Solution().solution("BAA")).isEqualTo(1);
    }

    @Test
    void t002() {
        assertThat(new Solution().solution("CAA")).isEqualTo(2);
    }

    @Test
    void t003() {
        assertThat(new Solution().solution("BBA")).isEqualTo(3);
    }

    @Test
    void t004() {
        assertThat(new Solution().solution("ZBA")).isEqualTo(3);
    }

    @Test
    void t005() {
        assertThat(new Solution().moveCostBy1("KAABC")).isEqualTo(4);
    }

    @Test
    void t006() {
        assertThat(new Solution().moveCostBy2("KAABC")).isEqualTo(2);
    }

    @Test
    void t007() {
        assertThat(Ut.getLongestIndexAndLength("KBAAAATK", 'A')).isEqualTo(
                new Ut.LongestIndexAndLength(2, 4));
    }

    @Test
    void t008() {
        assertThat(Ut.getLongestIndexAndLength("KAAAABAAAATK", 'A')).isEqualTo(
                new Ut.LongestIndexAndLength(1, 4));
    }
}
