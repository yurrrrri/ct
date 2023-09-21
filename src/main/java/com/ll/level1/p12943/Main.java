package com.ll.level1.p12943;

public class Main {
}

class Solution {
    public int solution(long num) {
        if (num == 1) return 0;

        int count = 0;

        while (count < 500) {
            num = num % 2 == 0 ? num /= 2 : num * 3 + 1;
            count++;

            if (num == 1) break;
        }

        return count != 500 ? count : -1;
    }
}