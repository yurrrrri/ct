package com.ll.level3.p12946;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    @Test
    void t001(){
        int[][] result = {{1, 3}};
        assertThat(new Solution().solution(1)).isEqualTo(result);
    }

    @Test
    void t002(){
        int[][] result = {{1, 2}, {1, 3}, {2, 3}};
        assertThat(new Solution().solution(2)).isEqualTo(result);
    }
}
