package com.ll.level1.p42576;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {
    @Test
    @DisplayName("leo")
    void t1() {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        assertThat(new Solution().solution(participant, completion)).isEqualTo("leo");
    }

    @Test
    @DisplayName("vinko")
    void t2() {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        assertThat(new Solution().solution(participant, completion)).isEqualTo("vinko");
    }

    @Test
    @DisplayName("mislav")
    void t3() {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        assertThat(new Solution().solution(participant, completion)).isEqualTo("mislav");
    }
}
