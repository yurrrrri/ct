package com.ll.level1.p12930;

public class Main {
}

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean upperFlag = true;

        for (char c : s.toCharArray()){
            if (!Character.isAlphabetic(c)) {
                sb.append(c);
                upperFlag = true;
            } else {
                if (upperFlag) {
                    sb.append(Character.toUpperCase(c));
                } else sb.append(Character.toLowerCase(c));

                upperFlag = !upperFlag;
            }
        }

        return sb.toString();
    }
}