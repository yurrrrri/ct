package com.ll.level2.p42586;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
}

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i<progresses.length; i++) {
            queue.add((int) Math.ceil((100.0 - progresses[i]) / speeds[i]));
        }

        List<Integer> list = new ArrayList<>();

        while(!queue.isEmpty()) {
            int remains = queue.poll();
            int count = 1;

            while(!queue.isEmpty() && remains >= queue.peek()) {
                queue.poll();
                count++;
            }

            list.add(count);
        }

        int[] result = new int[list.size()];

        for(int i=0; i<list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}