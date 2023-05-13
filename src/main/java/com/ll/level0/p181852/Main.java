package com.ll.level0.p181852;

import java.util.Arrays;

public class Main {
}

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 5, num_list.length);
    }
}