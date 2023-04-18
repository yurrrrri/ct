package com.ll.level1.p17681;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {
    @Test
    @DisplayName("비밀지도1")
    void t1() {
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] result = {"#####", "# # #", "### #", "#  ##", "#####"};
        assertThat(new Solution().solution(5, arr1, arr2)).isEqualTo(result);
    }

    @Test
    @DisplayName("비밀지도2")
    void t2() {
        int[] arr1 = {46, 33, 33, 22, 31, 50};
        int[] arr2 = {27, 56, 19, 14, 14, 10};
        String[] result = {"######", "###  #", "##  ##", " #### ", " #####", "### # "};
        assertThat(new Solution().solution(6, arr1, arr2)).isEqualTo(result);
    }
}
