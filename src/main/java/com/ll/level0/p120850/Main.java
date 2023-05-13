package com.ll.level0.p120850;

import java.util.Arrays;

public class Main {
}

class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[A-Z|a-z]", "");
        int[] result = new int[my_string.length()];
        for(int i=0; i<result.length; i++)
            result[i] = Integer.parseInt(my_string.substring(i, i+1));
        Arrays.sort(result);
        return result;
    }
}