package com.ll.level1.p147355;

public class Main {
}

class Solution {
    public int solution(String t, String p) {
        long target = Long.parseLong(p);

        int result = 0;

        for (int i = 0; i <= t.length() - p.length(); i++) {
            if (Long.parseLong(t.substring(i, i + p.length())) <= target) result++;
        }

        return result;
    }
}