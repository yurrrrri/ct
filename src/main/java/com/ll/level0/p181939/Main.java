package com.ll.level0.p181939;

public class Main {
}

class Solution {
    public int solution(int a, int b) {
        String a1 = "" + a + b;
        String b1 = "" + b + a;
        a = Integer.parseInt(a1);
        b = Integer.parseInt(b1);
        return a >= b ? a : b;
    }
}