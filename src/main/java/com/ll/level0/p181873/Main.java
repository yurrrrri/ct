package com.ll.level0.p181873;

public class Main {
}

class Solution {
    public String solution(String my_string, String alp) {
        String s = String.valueOf((char)(alp.charAt(0) - 32));
        return my_string.replaceAll(alp, s);
    }
}
