package com.ll.level0.p120836;

public class Main {
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++) {
            if(n % i == 0)
                answer++;
        }
        return answer;
    }
}