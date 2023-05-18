package com.ll.level0.p120886;

import java.util.Arrays;

public class Main {
}

class Solution {
    public int solution(String before, String after) {
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        for(int i=0; i<beforeArr.length; i++){
            if(beforeArr[i] != afterArr[i]) return 0;
        }
        return 1;
    }
}