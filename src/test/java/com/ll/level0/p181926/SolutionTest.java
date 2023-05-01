package com.ll.level0.p181926;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    void t001() {
        assertThat(new Solution().solution(0, "wsdawsdassw")).isEqualTo(-1);
    }
}
