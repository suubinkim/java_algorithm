package com.company.inflearn.section8.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int n, m, answer = 0;

    public void DFS(int L, int sum, int time, ArrayList<int[]> list) {
        if (time > m) return;
        if (L == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L + 1, sum + list.get(L)[0], time + list.get(L)[1], list);
            DFS(L + 1, sum, time, list);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner fb = new Scanner(System.in);
        n = fb.nextInt();
        m = fb.nextInt();
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int[] a = new int[2];
            for (int j = 0; j < 2; j++) {
                a[j] = fb.nextInt();
            }
            list.add(a);
        }
        T.DFS(0, 0, 0, list);
        System.out.println(answer);
    }
}
