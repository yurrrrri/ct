package com.ll.level0.p120889;

public class Main {
}

class Solution {
    public int solution(int[] sides) {
        int max = 0;
        int sum = 0;
        for (int i : sides) {
            if (max <= i) {
                max = i;
            }
            sum += i;
        }
        if ((sum - max) > max) return 1;
        else return 2;
    }
}