package com.ll.level0.p181888;

import java.util.ArrayList;
import java.util.List;

public class Main {
}

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<num_list.length; i+=n){
            list.add(num_list[i]);
        }
        int[] result = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
}