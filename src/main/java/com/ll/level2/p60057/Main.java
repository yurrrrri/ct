package com.ll.level2.p60057;

import java.util.*;

public class Main {
}

class Solution {
    public int solution(String s) {
        int answer = Integer.MAX_VALUE;

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= s.length(); i++) {
            sb.setLength(0);

            List<String> list = new ArrayList<>();

            for (int j = 0; j < s.length(); j += i) {
                if (j + i > s.length()) list.add(s.substring(j, s.length()));
                else list.add(s.substring(j, j + i));
            }

            String last = "";
            int count = 0;

            for (String value : list) {
                if (last.equals(value)) {
                    count++;
                } else {
                    if (count > 1) sb.append(count);
                    sb.append(last);
                    count = 1;
                    last = value;
                }
            }

            if (count > 1) sb.append(count);
            sb.append(last);

            int length = sb.toString().length();

            if (answer > length) answer = length;
        }

        return answer;
    }
}