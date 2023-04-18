package com.ll.level1.p142086;

import java.util.HashMap;
import java.util.Map;

public class Main {
}

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        Map<String, Integer> map = new HashMap<>();
        String[] arr = s.split("");

        for (int i = 0; i < arr.length; i++) {
            answer[i] = i - map.getOrDefault(arr[i], i + 1);
            map.put(arr[i], i);
        }

        return answer;
    }
}