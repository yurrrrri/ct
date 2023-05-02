package com.ll.level2.p12945;

public class Main {
}

class Solution {
    public int solution(int n) {
        int a = 0;
        int b = 1;
        int sum = 0;

        for(int i=2; i<=n; i++) {
            sum = (a + b) % 1234567;
            a = b;
            b = sum;
        }

        return sum;
    }
}