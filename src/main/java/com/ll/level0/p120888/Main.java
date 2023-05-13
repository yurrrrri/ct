package com.ll.level0.p120888;

import java.util.HashSet;
import java.util.Set;

public class Main {
}

class Solution {
    public String solution(String my_string) {
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        char[] arr = my_string.toCharArray();
        for(char c : arr) if(set.add(c)) sb.append(c);
        return sb.toString();
    }
}