package com.ll.level1.p12940;

public class Main {
}

class Solution {
    public int[] solution(int n, int m) {
        if (n > m) {
            int temp = n;
            n = m;
            m = temp;
        }

        if (m % n == 0) {
            return new int[] {n, m};
        } else {
            int num = 1;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && m % i == 0) {
                    num = i;
                }
            }

            return new int[] {num, n * m / num};
        }
    }
}