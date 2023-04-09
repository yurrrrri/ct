package com.ll.level0.p120585;

public class Main {
}

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int num : array) {
            if(num > height) answer ++;
        }
        return answer;
    }
}