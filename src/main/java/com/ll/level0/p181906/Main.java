package com.ll.level0.p181906;

public class Main {
}

class Solution {
    public int solution(String my_string, String is_prefix) {
        for(int i=1; i<=my_string.length(); i++) {
            if(my_string.substring(0, i).equals(is_prefix))
                return 1;
        }
        return 0;
    }
}