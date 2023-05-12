package com.ll.level0.p181861;

public class Main {
}

class Solution {
    public int[] solution(int[] arr) {
        int n = 0;
        for(int i : arr) n += i;

        int[] result = new int[n];
        int index = 0;
        for(int num : arr){
            for(int i=0; i<num; i++){
                result[index++] = num;
            }
        }

        return result;
    }
}