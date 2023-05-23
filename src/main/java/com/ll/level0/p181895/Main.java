package com.ll.level0.p181895;

import java.util.ArrayList;
import java.util.List;

public class Main {
}

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<2; i++){
            for(int j=intervals[i][0]; j<=intervals[i][1]; j++){
                list.add(arr[j]);
            }
        }
        int[] result = new int[list.size()];
        for(int i=0; i<result.length; i++){
            result[i] = list.get(i);
        }
        return result;
    }
}