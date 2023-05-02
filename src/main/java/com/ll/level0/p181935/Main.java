package com.ll.level0.p181935;

public class Main {
}

class Solution {
    public int solution(int n) {
        if(n % 2 == 1) return odd(n);
        return even(n);
    }

    private int odd(int n) {
        int sum = 0;

        for(int i=1; i<=n; i+=2) {
            sum += i;
        }

        return sum;
    }

    private int even(int n) {
        int sum = 0;

        for(int i=2; i<=n; i+=2) {
            sum += i * i;
        }

        return sum;
    }
}