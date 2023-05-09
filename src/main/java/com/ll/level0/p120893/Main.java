package com.ll.level0.p120893;

public class Main {
}

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        char[] arr = my_string.toCharArray();
        for(char c : arr){
            if(c >= 97) sb.append((char)(c - 32));
            else sb.append((char)(c + 32));
        }
        return sb.toString();
    }
}