package com.ll.level1.p86051;

public class Main {
}

class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        for (int number : numbers) {
            answer -= number;
        }
        return answer;
    }
}