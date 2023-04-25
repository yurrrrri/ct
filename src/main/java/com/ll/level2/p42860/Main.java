package com.ll.level2.p42860;

import java.util.List;
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

    int moveCost(String name) {
        if(name.length() == 1) return 0;
        if(Ut.isAllOf(name.substring(1), 'A')) return 0;

        return List.of(moveCostBy1(name), moveCostBy2(name), moveCostBy3(name), moveCostBy4(name))
                .stream().sorted().findFirst().orElse(0);
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

    public int moveCostBy3(String name) {
        Ut.LongestIndexAndLength indexAndLength = Ut.getLongestIndexAndLength(name, 'A');

        if(indexAndLength.index == -1) return moveCostBy1(name);

        int backCharsCount = name.length() - (indexAndLength.index + indexAndLength.length);
        int moveBack = backCharsCount * 2;

        int frontCharsCount = indexAndLength.index - 1;
        int moveFront = frontCharsCount;

        return moveBack + moveFront;
    }

    public int moveCostBy4(String name) {
        Ut.LongestIndexAndLength indexAndLength = Ut.getLongestIndexAndLength(name, 'A');

        if(indexAndLength.index == -1) return moveCostBy1(name);

        int frontCharsCount = indexAndLength.index - 1;
        int moveFront = frontCharsCount * 2;

        int backCharsCount = name.length() - (indexAndLength.index + indexAndLength.length);
        int moveBack = backCharsCount;

        return moveBack + moveFront;
    }
}

class Ut {

    public static boolean isAllOf(String str, char c) {
        return str.chars().allMatch(e -> c == e);
    }

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
            if(!(o instanceof LongestIndexAndLength)) return false;

            LongestIndexAndLength that = (LongestIndexAndLength) o;

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