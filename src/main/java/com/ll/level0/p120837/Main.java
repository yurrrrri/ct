package com.ll.level0.p120837;

public class Main {
}

class Solution {
    public int solution(int hp) {
        int answer = 0;
        while (hp >= 5) {
            hp -= 5;
            answer++;
        }
        while (hp >= 3) {
            hp -= 3;
            answer++;
        }
        while (hp > 0) {
            hp--;
            answer++;
        }
        return answer;
    }
}