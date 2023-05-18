package com.ll.level0.p120838;

public class Main {
}

class Solution {
    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.",
                "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--.."};
        String[] bits = letter.split(" ");
        for(String bit : bits){
            for(int i=0; i<morse.length; i++){
                if(morse[i].equals(bit)) sb.append((char)(i + 'a'));
            }
        }
        return sb.toString();
    }
}