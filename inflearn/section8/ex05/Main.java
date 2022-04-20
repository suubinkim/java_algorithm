package com.company.inflearn.section8.ex05;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int n, m;
    //제일 큰수로 해야됨 ( 최소 개수를 구하는 것이기 때문에 )
    static int answer = Integer.MAX_VALUE;
    static Integer[] arr;

    //L-동전 갯수
    public void DFS(int L, int sum) {
        if (sum > m) return;
        //지금까지 나온 최소 개수보다는 더 많은 개수 사용 하지 않기
        if (L >= answer) return;
        if (sum == m) {
            answer = L;
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
        arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = fb.nextInt();
        }
        //내림차순 정렬하여 큰 단위부터 구하기 ( 갯수 확인 범위 줄이기 )
        //collections쓰려면 int가 아닌 Integer 사용
        Arrays.sort(arr, Collections.reverseOrder());
        m = fb.nextInt();
        T.DFS(0, 0);
        System.out.println(answer);
    }
}
