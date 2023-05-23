package com.ll.level0.p181891;

import java.util.ArrayList;
import java.util.List;

public class Main {
}

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();

        for(int i=n; i< num_list.length; i++) list.add(num_list[i]);
        for(int i=0; i<n; i++) list.add(num_list[i]);

        int[] result = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
}