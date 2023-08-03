package com.ll.level1.p12935;

public class Main {
}

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[] {-1};
        else {
            int minimum = Integer.MAX_VALUE;
            for (int num : arr) {
                if (minimum > num) minimum = num;
            }
            int index = 0;
            int[] answer = new int[arr.length - 1];
            for (int num : arr) {
                if (num != minimum) {
                    answer[index++] = num;
                }
            }

            return answer;
        }
    }
}