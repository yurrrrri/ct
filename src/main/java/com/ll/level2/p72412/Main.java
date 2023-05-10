package com.ll.level2.p72412;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
}

class Solution {
    public int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
        Map<String, List<Integer>> map = makeIndex(info);

        for(int i=0; i< query.length; i++){
            int index = query[i].lastIndexOf(" ");
            String key = query[i].substring(0, index);
            int score = Integer.parseInt(query[i].substring(index + 1));

            answer[i] = count(map.get(key), score);
        }

        return answer;
    }

    private int count(List<Integer> list, int score) {
        if(list == null) return 0;
        if(list.isEmpty()) return 0;

        int left = 0;
        int right = list.size() - 1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(list.get(mid) < score) left = mid + 1;
            else right = mid - 1;
        }

        return list.size() - left;
    }

    private Map<String, List<Integer>> makeIndex(String[] info) {
        Map<String, List<Integer>> map = new HashMap<>();

        for(String i : info){
            String[] bits = i.split(" ");
            String[] langs = {"-", bits[0]};
            String[] jobs = {"-", bits[1]};
            String[] careers = {"-", bits[2]};
            String[] foods = {"-", bits[3]};
            int score = Integer.parseInt(bits[4]);

            for(String lang : langs){
                for(String job : jobs){
                    for(String career : careers){
                        for(String food : foods){
                            String key = lang + " and " + job + " and " + career + " and " + food;
                            map.putIfAbsent(key, new ArrayList<Integer>());
                            map.get(key).add(score);
                        }
                    }
                }
            }
        }
        map.forEach((key, scores) -> scores.sort(Integer::compareTo));
        return map;
    }
}