package com.ll.level2.p42860;

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