package com.ll.level1.p12915;

import java.util.*;

public class Main {
}

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);

        String[] result = new String[strings.length];
        for(int i=0; i< strings.length; i++){
            result[i] = strings[i].substring(n, n+1);
        }
        Arrays.sort(result);

        List<String> list = new ArrayList<>(Arrays.asList(strings));
        for(int i=0; i<result.length; i++){
            for(int j=0; j<list.size(); j++){
                if(result[i].equals(list.get(j).substring(n, n+1))){
                    result[i] = list.get(j);
                    list.remove(j);
                    break;
                }
            }
        }

        return result;
    }
}