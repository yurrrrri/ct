package com.ll.level0.p181884;

public class Main {
}

class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for(int num : numbers) {
            answer += num;
            if(answer > n) break;
        }
        return answer;
    }
}