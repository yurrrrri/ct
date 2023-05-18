package com.ll.level0.p120848;

public class Main {
}

class Solution {
    public int solution(int n) {
        int temp = 1;
        int num = 1;
        while(temp <= n){
            temp *= num;
            if(temp > n) break;
            num++;
        }
        return num - 1;
    }
}