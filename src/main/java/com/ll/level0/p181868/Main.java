package com.ll.level0.p181868;

public class Main {
}

class Solution {
    public String[] solution(String my_string) {
        String[] temp = my_string.trim().split(" ");
        int n = temp.length;
        for(String s : temp){
            if(s.equals("")) n--;
        }
        String[] result = new String[n];
        int idx = 0;
        for(String s : temp){
            if(!s.equals("")) result[idx++] = s;
        }

        return result;
    }
}