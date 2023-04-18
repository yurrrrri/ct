package com.ll.level0.p120816;

public class Main {
}

class Solution {
    public int solution(int slice, int n) {
        int answer = n / slice;
        if (n % slice >= 1) {
            answer++;
        }
        return answer;
    }
}