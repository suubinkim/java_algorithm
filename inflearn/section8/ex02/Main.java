package com.company.inflearn.section8.ex02;

import java.util.Scanner;

public class Main {
    static int c, n, big = 0;
    static int[] w;

    public void DFS(int L, int sum, int[] w) {
        //sum>c 이면 멈춰야함
        if(sum>c) return;
        if (L == n) {
            if (sum > big) big = sum;
        } else {
            DFS(L + 1, sum + w[L], w);
            DFS(L + 1, sum, w);
        }
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner fb = new Scanner(System.in);
        c = fb.nextInt();
        n = fb.nextInt();
        w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = fb.nextInt();
        }
        T.DFS(0, 0, w);
        System.out.println(big);
    }
}
