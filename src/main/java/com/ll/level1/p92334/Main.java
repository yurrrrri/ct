package com.ll.level1.p92334;

import java.util.*;

public class Main {
}

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Set<String> set = new HashSet<>();
        for(String names : report){
            set.add(names);
        }

        Map<String, Integer> map = new HashMap<>();
        String[] reporter = new String[set.size()];
        String[] reportee = new String[set.size()];
        int index = 0;

        Iterator iter = set.iterator();
        while(iter.hasNext()){
            String[] names = iter.next().toString().split(" ");
            reporter[index] = names[0];
            reportee[index] = names[1];
            map.put(names[1], map.getOrDefault(names[1], 0)+1);
            index++;
        }

        Map<String, Integer> result = new LinkedHashMap<>();
        for(String name : id_list){
            result.put(name, 0);
        }

        for(String name : map.keySet()){
            if(map.get(name) >= k){
                for(int i=0; i< reporter.length; i++){
                    if(reportee[i].equals(name)){
                        result.put(reporter[i], result.getOrDefault(reporter[i], 0)+1);
                    }
                }
            }
        }

        int[] answer = new int[id_list.length];
        int idx = 0;
        for(int count : result.values()){
            answer[idx++] = count;
        }

        return answer;
    }
}
