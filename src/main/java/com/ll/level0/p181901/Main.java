package com.ll.level0.p181901;

public class Main {
}

class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];

        int index = 0;
        for(int i=k; i<=n; i+=k) {
            answer[index] = i;
            index++;
        }

        return answer;
    }
}