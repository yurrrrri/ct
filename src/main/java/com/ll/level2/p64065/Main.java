package com.ll.level2.p64065;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
}

class Solution {
    public int[] solution(String s) {
//        int[] result;
//        if(!s.contains(",")){
//            result = new int[1];
//            result[0] = Integer.parseInt(s.substring(2, s.length() - 2));
//        } else {
//            String[] bits = s.substring(2, s.length() - 2).split("},\\{");
//            Arrays.sort(bits, Comparator.comparingInt(String::length));
//            result = new int[bits.length];
//            for(int i=0; i<bits.length; i++){
//                String target = bits[i];
//                result[i] = Integer.parseInt(target);
//                for(int j=i+1; j<bits.length; j++){
//                    if(bits[j].contains(target + ","))
//                        bits[j] = bits[j].replace(target + ",", "");
//                    else bits[j] = bits[j].replace("," + target, "");
//                }
//            }
//        }
//        return result;
        int[] result;
        List<Integer> list = new ArrayList<>();
        if(!s.contains(",")){
            result = new int[1];
            result[0] = Integer.parseInt(s.substring(2, s.length() - 2));
        } else {
            String[] bits = s.substring(2, s.length() - 2).split("},\\{");
            Arrays.sort(bits, Comparator.comparingInt(String::length));
            for(String bit : bits){
                String[] temp = bit.split(",");
                for(int i=0; i<temp.length; i++){
                    int num = Integer.parseInt(temp[i]);
                    if(!list.contains(num)) list.add(num);
                }
            }
            result = new int[list.size()];
            for(int i=0; i<list.size(); i++){
                result[i] = list.get(i);
            }
        }
        return result;
    }
}