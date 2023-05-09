package com.ll.level0.p120862;

import java.util.Arrays;

public class Main {
}

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int length = numbers.length;
        return Math.max(numbers[0] * numbers[1], numbers[length - 1] * numbers[length - 2]);
    }
}