package com.ll.level0.p120909;

public class Main {
}

class Solution {
    public int solution(int n) {
        Double d = Math.sqrt(n);
        int i = Integer.parseInt(String.valueOf(Math.round(d)));
        return d == i ? 1 : 2;
    }
}