package com.ll.level1.p82612;

public class Main {
}

class Solution {
    public long solution(int price, int money, int count) {
        long answer = price;

        for (int i = 2; i <= count; i++)
            answer += price * i;

        return answer - money > 0 ? answer - money : 0;
    }
}