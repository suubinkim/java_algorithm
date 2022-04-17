package com.company.inflearn.section8.ex04;

import java.util.Scanner;

public class Main {
    static int n, m;
    //arr 크기를 여기서 m넣어주면 안됨
    static int[] arr;

    public void DFS(int L) {
        if (L == m) {
            for (int x : arr) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                arr[L] = i;
                DFS(L + 1);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner fb = new Scanner(System.in);
        n = fb.nextInt();
        m = fb.nextInt();
        //m이 부여된후 arr 크기 지정
        arr = new int[m];
        T.DFS(0);
    }
}
