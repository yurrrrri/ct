package com.ll.level2.p70129;

public class Main {
}

class Solution {
    public int[] solution(String s) {
        if (s.equals("1")) return new int[]{0, 0};

        int count = 0;
        int zero = 0;

        while (true) {
            count++;

            int tmp = s.length();

            s = s.replaceAll("0", "");

            tmp -= s.length();
            zero += tmp;

            s = Integer.toString(s.length(), 2);

            if (s.equals("1")) return new int[]{count, zero};
        }
    }
}