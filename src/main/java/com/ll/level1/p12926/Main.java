package com.ll.level1.p12926;

public class Main {
}

class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (!Character.isAlphabetic(c)) {
                sb.append(c);
                continue;
            }

            char target = c <= 'Z' ? 'Z' : 'z';
            int tmp;
            if (c <= target) {
                tmp = c + n;

                if (tmp <= target) sb.append((char) tmp);
                else sb.append((char) (tmp - 26));
            }
        }

        return sb.toString();
    }
}