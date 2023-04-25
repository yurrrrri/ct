package com.ll.level1.p42862;

import java.util.HashSet;

public class Main {
}

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        HashSet<Integer> reserveSet = new HashSet<>();
        HashSet<Integer> lostSet = new HashSet<>();

        for(int l : lost) {
            lostSet.add(l);
        }
        for(int r : reserve) {
            if(lostSet.contains(r)) {
                lostSet.remove(r);
            } else {
                reserveSet.add(r);
            }
        }

        for (int i : reserveSet) {
            if (lostSet.contains(i - 1)) {
                lostSet.remove(i - 1);
            } else if (lostSet.contains(i + 1)) {
                lostSet.remove(i + 1);
            }
        }

        return n - lostSet.size();
    }
}