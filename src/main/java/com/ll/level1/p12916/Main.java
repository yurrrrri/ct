package com.ll.level1.p12916;

public class Main {
}

class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        char[] list = s.toCharArray();
        int p = 0;
        int y = 0;

        for(char c : list) {
            if (c == 'p') p++;
            else if (c == 'y') y++;
        }

        return p == y;
    }
}