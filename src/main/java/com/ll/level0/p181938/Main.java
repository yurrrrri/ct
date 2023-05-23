package com.ll.level0.p181938;

public class Main {
}

class Solution {
    public int solution(int a, int b) {
        String str = "" + a + b;
        int num1 = Integer.parseInt(str);
        int num2 = 2 * a * b;
        return num1 > num2 ? num1 : num2;
    }
}