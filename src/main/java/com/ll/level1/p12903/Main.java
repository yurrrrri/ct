package com.ll.level1.p12903;

public class Main {
}

class Solution {
    public String solution(String s) {
        return s.length() % 2 == 0 ?
                s.substring(s.length() / 2 - 1, s.length() / 2 + 1) :
                s.substring(s.length() / 2, s.length() / 2 + 1);
    }
}