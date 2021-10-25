package com.company.section2;

import java.util.*;

public class Main {
    public int[] solution(int t) {
        int[] answer = new int[t];
        answer[0] = answer[1] = 1;
        for(int i=2;i<t;i++) {
            answer[i] = answer[i-1] + answer[i-2];
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int x : T.solution(t)) System.out.print(x+" ");
    }
}