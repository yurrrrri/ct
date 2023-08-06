package com.ll.level1.p12917;

import java.util.Arrays;

public class Main {
}

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        return new StringBuilder(new String(arr)).reverse().toString();
    }
}