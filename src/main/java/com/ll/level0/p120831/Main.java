package com.ll.level0.p120831;

public class Main {
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=0; i<=n; i+=2){
            answer += i;
        }
        return answer;
    }
}