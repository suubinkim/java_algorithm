package com.company.section7.ex01;

import java.util.Scanner;

public class Main {
    public void DFS(int n) {
        if (n == 0) return;
        else {
            DFS(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        T.DFS(n);
    }
}
