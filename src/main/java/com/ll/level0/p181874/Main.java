package com.ll.level0.p181874;

public class Main {
}

class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        char[] bits = myString.toCharArray();
        for(char c : bits){
            if(c == 'a') sb.append("A");
            else if(c >= 66 && c <= 90) sb.append((char)(c + 32));
            else sb.append(c);
        }
        return sb.toString();
    }
}