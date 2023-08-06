package com.ll.level1.p12910;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
}

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (i % divisor == 0) list.add(i);
        }

        Collections.sort(list);
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result.length == 0 ? new int[]{-1} : result;
    }
}