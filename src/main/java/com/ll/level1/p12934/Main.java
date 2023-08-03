package com.ll.level1.p12934;

public class Main {
}

class Solution {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        if ((int)sqrt == sqrt) {
            long num = (long)(sqrt + 1);
            return num * num;
        } else return -1;
    }
}