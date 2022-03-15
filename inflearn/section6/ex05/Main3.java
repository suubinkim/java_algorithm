package com.company.inflearn.section6.ex05;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public String solution(int t, int[] arr) {
        String answer = "U";
        Arrays.sort(arr);
        for (int i = 0; i < t - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                answer = "D";
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main3 T = new Main3();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print(T.solution(t, arr));
    }
}
