package com.ll.level1.p12916;

public class Main {
}

class Solution {
    boolean solution(String s) {
        char[] list = s.toCharArray();
        int p = 0;
        int y = 0;
        for(char c : list) {
            if (c == 'P' || c == 'p') p++;
            else if (c == 'y' || c == 'Y') y++;
        }

        if (p == 0 && y == 0) return true;
        else return p == y ? true : false;
    }
}