package com.company.section2.ex11_임시반장;

import java.util.*;
public class Main {

    public int solution(int t,int[][] arr) {
        int answer=0;
        int max = 0;
        for(int i=1;i<=t;i++){
            int cnt = 0;
            for(int j=1;j<=t;j++){
                for(int k=1;k<=5;k++){
                    if(arr[i][k]==arr[j][k]){
                        cnt ++;
                        break;
                    }
                }
            }
            if(max<cnt){
                max=cnt;
                answer= i;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[][] arr = new int[t+1][6];
        for(int i=1;i<=t;i++){
            for(int j=1;j<=5;j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.print(T.solution(t,arr));
    }
}