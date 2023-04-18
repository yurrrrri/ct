package com.ll.level1.p92334;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {
    @Test
    @DisplayName("2,1,1,0")
    void t1() {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        int[] result = {2, 1, 1, 0};
        assertThat(new Solution().solution(id_list, report, k)).isEqualTo(result);
    }

    @Test
    @DisplayName("0,0")
    void t2() {
        String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;
        int[] result = {0, 0};
        assertThat(new Solution().solution(id_list, report, k)).isEqualTo(result);
    }
}
