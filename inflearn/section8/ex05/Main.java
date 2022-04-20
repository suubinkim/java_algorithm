package com.company.inflearn.section8.ex05;

import java.util.Scanner;

public class Main {
    static int n, m;
    //제일 큰수로 해야됨 ( 최소 개수를 구하는 것이기 때문에 )
    static int answer = Integer.MAX_VALUE;
    static int[] arr;

    //L-동전 갯수
    public void DFS(int L, int sum) {
        if (sum > m) return;
        if (sum == m) {
            answer = Math.min(L, answer);
        } else {
            for (int i = 0; i < n; i++) {
                DFS(L + 1, sum + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner fb = new Scanner(System.in);
        n = fb.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = fb.nextInt();
        }
        m = fb.nextInt();
        T.DFS(0, 0);
        System.out.println(answer);
    }
}
