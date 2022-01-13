package com.company.section6.ex05;

import java.util.Scanner;

public class Main {
    public String solution(int t, int[] arr) {
        String answer = "U";
        for (int i = 0; i < t; i++) {
            for (int j = i + 1; j < t; j++) {
                if (arr[i] == arr[j]) {
                    answer = "D";
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print(T.solution(t, arr));
    }
}
