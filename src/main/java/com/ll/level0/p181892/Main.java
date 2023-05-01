package com.ll.level0.p181892;

import java.util.Arrays;

public class Main {
}

class Solution {
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, n - 1, num_list.length);
    }
}