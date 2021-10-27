package com.company.algorithm;
import java.util.*;
public class Main {
    int[] dx = {-1,0,1,0};
    int[] dy = { 0,1,0,-1};
    public int solution(int t,int[][] arr) {
        int answer=0;
        for(int i=0;i<t;i++){
            for(int j=0;j<t;j++){
                for(int k=0;k<4;k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                }
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
