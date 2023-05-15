package com.ll.level2.p42583;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    @Test
    void t001(){
        int[] truck_weights = {7, 4, 5, 6};
        assertThat(new Solution().solution(2, 10, truck_weights)).isEqualTo(8);
    }

    @Test
    void t002(){
        int[] truck_weights = {10};
        assertThat(new Solution().solution(100, 100, truck_weights)).isEqualTo(101);
    }

    @Test
    void t003(){
        int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};
        assertThat(new Solution().solution(100, 100, truck_weights)).isEqualTo(110);
    }
}
