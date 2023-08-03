package com.ll.level1.p12918;

public class Main {
}

class Solution {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) return false;

        char[] arr = s.toCharArray();

        for (char c : arr) {
            if ((c - '0') > 9) return false;
        }

        return true;
    }
}