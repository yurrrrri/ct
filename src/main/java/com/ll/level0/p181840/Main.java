package com.ll.level0.p181840;

public class Main {
}

class Solution {
    public int solution(int[] num_list, int n) {
        for(int i : num_list) {
            if(i == n)
                return 1;
        }
        return 0;
    }
}