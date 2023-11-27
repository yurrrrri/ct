package com.ll.level1.p81301;

public class Main {
}

class Solution {
    public int solution(String s) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i < words.length; i++){
            s = s.replace(words[i], Integer.toString(i));
        }

        return Integer.parseInt(s);
    }
}