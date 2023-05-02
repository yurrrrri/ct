package com.ll.level0.p120813;

import java.util.ArrayList;
import java.util.List;

public class Main {
}

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        for(int i=1; i<=n; i+=2) {
            list.add(i);
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}