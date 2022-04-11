package com.company.inflearn.section7.ex14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;

    public void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        //출발점 1에 방문 체크하고 거리는 본인이니 0
        ch[v] = 1;
        dis[v] = 0;
        //큐에 1 넣기
        queue.offer(v);
        while (!queue.isEmpty()) {
            //위에서 넣었던 1 꺼내기 cv == 1
            int cv = queue.poll();
            //cv가 가리키는 숫자 점 하나씩 방문 체크
            for (int nv : graph.get(cv)) {
                // 방문하지 않았다면 방문체크 하고 큐에 넣어 거리 표시
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n + 1];
        dis = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        T.BFS(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }
}
