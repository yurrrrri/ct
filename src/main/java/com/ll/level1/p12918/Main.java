package com.ll.level1.p12918;

public class Main {
}

class Solution {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) return false;

        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }

        return true;
    }
}