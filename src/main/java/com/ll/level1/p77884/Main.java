package com.ll.level1.p77884;

public class Main {
}

class Solution {
    public int solution(int left, int right) {
        int count = left;
        int result = 0;

        for (int i = left; i <= right; i++) {
            if (isEven(i)) result += i;
            else result -= i;
        }

        return result;
    }

    public boolean isEven(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }

        return count % 2 == 0;
    }
}