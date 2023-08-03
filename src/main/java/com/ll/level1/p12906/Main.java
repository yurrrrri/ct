package com.ll.level1.p12906;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return arr;

        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (stack.peek() == arr[i]) {
                stack.pop();
            }
            stack.push(arr[i]);
        }

        int[] answer = new int[stack.size()];

        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}