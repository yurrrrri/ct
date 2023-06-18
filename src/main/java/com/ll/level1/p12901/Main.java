package com.ll.level1.p12901;

public class Main {
}

class Solution {
    public String solution(int a, int b) {
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};

        int num = 4 + b;
        if(a != 1) {
            for(int i=0; i<a-1; i++) {
                num += month[i];
            }
        }

        return days[num % 7];
    }
}