package com.ll.level0.p120846;

public class Main {
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            int temp = 0;
            for(int j=1; j<=i; j++){
                if(i % j == 0) temp++;
            }
            if(temp >= 3) answer++;
        }
        return answer;
    }
}