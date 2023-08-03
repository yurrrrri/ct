package com.ll.level0.p120956;

public class Main {
}

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (String s : babbling) {
            s = s.replace("aya", " ")
                    .replace("ye", " ")
                    .replace("woo", " ")
                    .replace("ma", " ");
            if (s.trim().equals("")) answer++;
        }
        return answer;
    }
}