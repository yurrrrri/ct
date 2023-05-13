package com.ll.level0.p181919;

import java.util.ArrayList;
import java.util.List;

public class Main {
}

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);

        int temp = n;
        while(temp != 1){
            if(temp % 2== 0) {
                temp /= 2;
                list.add(temp);
            } else {
                temp = 3 * temp + 1;
                list.add(temp);
            }
        }

        int[] result = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            result[i] = list.get(i);
        }

        return result;
    }
}