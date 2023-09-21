package com.ll.level1.p68935;

public class Main {
}

class Solution {
    public int solution(int n) {
        String s = Integer.toString(n, 3);
        String reversed = new StringBuilder(s).reverse().toString();

        return Integer.parseInt(reversed, 3);
    }
}