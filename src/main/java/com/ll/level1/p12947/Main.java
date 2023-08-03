package com.ll.level1.p12947;

public class Main {
}

class Solution {
    public boolean solution(int x) {
        String str = x + "";
        int num = 0;

        for(int i=0; i<str.length(); i++)
            num += Integer.parseInt(str.substring(i, i+1));

        return x % num == 0;
    }
}