package com.ll.level0.p181865;

public class Main {
}

class Solution {
    public int solution(String binomial) {
        String[] bits = binomial.split(" ");
        int a = Integer.parseInt(bits[0]);
        int b = Integer.parseInt(bits[2]);
        if(binomial.indexOf("+") >= 0){
            return a + b;
        } else if(binomial.indexOf("-") >= 0){
            return a - b;
        } else {
            return a * b;
        }
    }
}