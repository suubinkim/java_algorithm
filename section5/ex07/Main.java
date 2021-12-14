package com.company.section5.ex07;

import java.util.*;

public class Main {
    public int solution(int n, int m, Integer[] arr) {
        int answer=0;
        int a = arr[m];
        Queue<Integer> q = new LinkedList<>();
        for (Integer x : arr) q.offer(x);
        for (Integer x : arr) {

        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print(T.solution(n, m, arr));
    }
}
