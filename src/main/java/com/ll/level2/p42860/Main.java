package com.ll.level2.p42860;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
}

class Solution {
    public int solution(String name) {
        return nameCost(name) + moveCost(name);
    }

    private int nameCost(String name) {
        int nameCost = 0;

        for(int i=0; i<name.length(); i++) {
            char c = name.charAt(i);
            nameCost += Math.min(c - 'A', 'Z' + 1 - c);
        }

        return nameCost;
    }

    private int moveCost(String name) {
        int moveCost = 0;

        for(int i=0; i<name.length(); i++) {
            if((name.charAt(i) - 'A') > 0) {
                moveCost = i;
            }
        }

        return moveCost;
    }

    public int moveCostBy1(String name) {
        int move = 0;

        for(int i=0; i<name.length(); i++){
            if(name.charAt(i) != 'A') move = i;
        }

        return move;
    }

    public int moveCostBy2(String name) {
        int move = 0;

        for(int i=name.length()-1; i>=1; i--) {
            if(name.charAt(i) != 'A') move = name.length() - i;
        }

        return move;
    }
}

class Ut {
    public static class LongestIndexAndLength {
        public int index;
        public int length;

        public LongestIndexAndLength(int index, int length) {
            this.index = index;
            this.length = length;
        }

        @Override
        public boolean equals(Object o) {
            if(this == o) return true;
            if(!(o instanceof LongestIndexAndLength that)) return false;

            if(index != that.index) return false;
            return length == that.length;
        }

        @Override
        public String toString() {
            return "LongestIndexAndLength{" +
                    "index=" + index +
                    ", length=" + length + '}';
        }
    }

    public static LongestIndexAndLength getLongestIndexAndLength(String str, char c) {
        String regex = c + "+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        int maxLength = 0;
        int maxIndex = -1;

        while(matcher.find()) {
            int startIndex = matcher.start();
            int length = matcher.end() - startIndex;

            if(length > maxLength) {
                maxLength = length;
                maxIndex = startIndex;
            }
        }

        return new LongestIndexAndLength(maxIndex, maxLength);
    }
}