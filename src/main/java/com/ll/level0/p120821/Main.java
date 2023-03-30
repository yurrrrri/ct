package com.ll.level0.p120821;

public class Main {
}

class Solution {
    public int[] solution(int[] num_list) {
        int[] list = new int[num_list.length];
        for(int i=0; i<num_list.length; i++){
            list[i] = num_list[num_list.length-1-i];
        }
        return list;
    }
}