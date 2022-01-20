package com.company.section6.ex08;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i] == m) answer = i + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print(T.solution(n, m, arr));
    }
}
