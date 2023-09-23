package com.ll.level0.p120887;

public class Main {
}

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        StringBuilder sb = new StringBuilder();

        for (int a = i; a <= j; a++) {
            sb.append(a + "");
        }

        String s = sb.toString();

        return s.length() - s.replace(Integer.toString(k), "").length();
    }
}