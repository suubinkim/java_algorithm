package com.company.inflearn.section7.ex12;

import java.util.Scanner;

class Main {
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;

    public void DFS(int v) {
        if (v == n) answer++;
        else {
            for (int i = 1; i <= n; i++) {
                //v점과 이어져 있으면서 방문 안한 점
                if (graph[v][i] == 1 && ch[i] == 0) {
                    //방문하니 체크해주고 그 점으로 이동
                    ch[i] = 1;
                    DFS(i);
                    //재귀함수이니 다시 돌아오면 체크 풀어주기
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new int[n + 1][n + 1];
        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            //방향그래프 관계 인접행렬로 생성
            graph[a][b] = 1;
        }
        //시작점 1은 방문하고 있으므로 값 1로 체크
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}
