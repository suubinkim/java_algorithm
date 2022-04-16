package com.company.inflearn.section8.ex01;

import java.util.Scanner;

public class Main {
    static int n, total = 0;
    static String answer = "NO";
    boolean flag = false;

    public void DFS(int L, int sum, int[] arr) {
        if (flag) return;
        //부분집합의 합이 total/2보다 커졌을때도 더 볼 필요가 없으므로 return
        if (sum > total / 2) return;
        //L이 n이 되었을 때 부분집합 완성 (각 원소들의 포함유무 따른 경우의 수 )
        if (L == n) {
            // totla/2로 해도 되나 sum이 홀수일경우 답이 틀릴 수 있음(이때는 나머지가 0일경우도 포함해야함)
            if (total - sum == sum) {
                answer = "YES";
                //재귀함수를 멈추기 위해서는 여기서 return 주면 안되고 flag 를 이용해서 밖에서 멈춰준다
                flag = true;
            }
        } else {
            //arr에 L번째 원소를 포함한 부분 집합
            DFS(L + 1, sum + arr[L], arr);
            //arr에 L번째 원소를 포함하지 않은 부분 집합
            DFS(L + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner fb = new Scanner(System.in);
        n = fb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = fb.nextInt();
            total += arr[i];
        }
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
