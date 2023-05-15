package com.ll.level2.p42583;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
}

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        for(int i=0; i<bridge_length; i++){
            bridge.add(0);
        }
        int sum = 0;
        int time = 0;
        for(int truck : truck_weights){
            while(sum + truck > weight){
                sum -= bridge.poll();
                if(sum + truck <= weight) break;
                bridge.add(0);
                time++;
            }
            if(bridge.size() == bridge_length) sum -= bridge.poll();
            sum += truck;
            time++;
            bridge.add(truck);
        }
        return time + bridge_length;
    }
}