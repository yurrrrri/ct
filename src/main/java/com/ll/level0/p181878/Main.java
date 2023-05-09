package com.ll.level0.p181878;

public class Main {
}

class Solution {
    public int solution(String myString, String pat) {
        return myString.toUpperCase().contains(pat.toUpperCase()) ? 1 : 0;
    }
}