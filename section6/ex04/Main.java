package com.company.section6.ex04;

import java.util.Scanner;

public class Main {
    public int[] solution(int s, int n, int[] arr) {
        int[] catche = new int[s];
        for (int i = 0; i < n; i++) {

        }
        return arr;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int x : T.solution(s, n, arr)) {
            System.out.print(x + " ");
        }
    }
}
