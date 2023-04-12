package com.ll.level0.p120811;

import java.util.Arrays;

public class Main {
}

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }
}