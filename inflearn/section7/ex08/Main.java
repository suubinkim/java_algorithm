package com.company.inflearn.section7.ex08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    int answer = 0;
    int[] dis = {1, -1, 5};
    int[] ch;
    Queue<Integer> Q = new LinkedList<>();

    public int BFS(int s, int e) {
        //직선 좌표 점이 1-1000까지이기 때문에
        ch = new int[1001];
        //방문했을때 1
        ch[s] = 1;
        Q.offer(s);
        int L = 0; //레벨
        while (!Q.isEmpty()) {
            //처음에는 1
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int x = Q.poll();
                //자식 노드 3갈래로 나누어짐 (+1,=1,+5)
                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];
                    //자식노드 중 송아지 위치가 있다면 레벨 +1 출력
                    //Q.poll()로 꺼내는 것 보다 들어가기 전에 확인하는 것이 더 나음
                    if (nx == e) return L + 1;
                    //nx 범위 정해주고 방문 안 한 노드 (==0)
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1; //방문시 1
                        Q.offer(nx);
                    }
                }
            }
            L++;//레벨 증가
        }
        return 0;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int e = kb.nextInt();
        System.out.println(T.BFS(s, e));
    }
}
