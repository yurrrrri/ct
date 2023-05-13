package com.ll.level0.p181856;

public class Main {
}

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if(arr1.length > arr2.length) return 1;
        else if(arr1.length < arr2.length) return -1;
        else {
            int temp = 0;
            for(int i=0; i<arr1.length; i++){
                temp = temp + arr1[i] - arr2[i];
            }
            if(temp > 0) return 1;
            else if(temp < 0) return -1;
            else return 0;
        }
    }
}