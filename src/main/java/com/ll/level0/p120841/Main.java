package com.ll.level0.p120841;

public class Main {
}

class Solution {
    public int solution(int[] dot) {
        if (dot[0] > 0 && dot[1] > 0) return 1;
        else if (dot[0] < 0 && dot[1] > 0) return 2;
        else if (dot[0] < 0 && dot[1] < 0) return 3;
        else return 4;
    }
}