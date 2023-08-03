package com.ll.level1.p12969;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<b; i++)
            sb.append("*".repeat(a) + "\n");

        System.out.println(sb);
    }
}

public class Main {
}

