package com.ll.level0.p181926;

public class Main {
}

class Solution {
    public int solution(int n, String control) {
        char[] array = control.toCharArray();
        for(char c : array) {
            if(c == 'w') n++;
            else if(c == 's') n--;
            else if(c == 'd') n += 10;
            else n -= 10;
        }
        return n;
    }
}