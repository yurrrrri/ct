package com.ll.level0.p120583;

public class Main {
}

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int number : array) {
            if (number == n) answer++;
        }
        return answer;
    }
}