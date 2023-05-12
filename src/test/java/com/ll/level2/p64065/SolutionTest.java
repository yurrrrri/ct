package com.ll.level2.p64065;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    @Test
    void t001(){
        int[] result = {2, 1, 3, 4};
        assertThat(new Solution().solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")).isEqualTo(result);
    }

    @Test
    void t002(){
        int[] result = {2, 1, 3, 4};
        assertThat(new Solution().solution("{{1,2,3},{2,1},{1,2,4,3},{2}}")).isEqualTo(result);
    }

    @Test
    void t003(){
        int[] result = {111, 20};
        assertThat(new Solution().solution("{{20,111},{111}}")).isEqualTo(result);
    }

    @Test
    void t004(){
        int[] result = {123};
        assertThat(new Solution().solution("{{123}}")).isEqualTo(result);
    }

    @Test
    void t005(){
        int[] result = {3, 2, 4, 1};
        assertThat(new Solution().solution("{{4,2,3},{3},{2,3,4,1},{2,3}}")).isEqualTo(result);
    }
}
