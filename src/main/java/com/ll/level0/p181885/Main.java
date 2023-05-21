package com.ll.level0.p181885;

import java.util.ArrayList;
import java.util.List;

public class Main {
}

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList<>();
        for(int i=0; i< todo_list.length; i++){
            if(!finished[i]) list.add(todo_list[i]);
        }
        String[] result = new String[list.size()];
        for(int i=0; i< result.length; i++){
            result[i] = list.get(i);
        }
        return result;
    }
}