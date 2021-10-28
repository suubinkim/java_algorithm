package com.company.section2.ex10_봉우리;

import java.util.*;
public class Main {
    int[] dx = {-1,0,1,0};
    int[] dy = { 0,1,0,-1};
    public int solution(int t,int[][] arr) {
        int answer=0;
        for(int i=0;i<t;i++){
            for(int j=0;j<t;j++){
                boolean flag = true;
                for(int k=0;k<4;k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(nx >=0 & nx <t && ny>=0 && ny<t && arr[nx][ny]>=arr[i][j]){
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[][] arr = new int[t][t];
        for(int i=0;i<t;i++){
            for(int j=0;j<t;j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.print(T.solution(t,arr));
    }
}
