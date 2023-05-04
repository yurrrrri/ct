package com.ll.level0.p120839;

public class Main {
}

class Solution {
    public String solution(String rsp) {
        char[] arr = rsp.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(char c : arr) {
            if(c == '2') sb.append("0");
            else if(c == '0') sb.append("5");
            else sb.append("2");
        }

        return sb.toString();
    }
}