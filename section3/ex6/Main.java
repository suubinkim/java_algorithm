package com.company.section3.ex6;

import java.util.*;
public class Main {

    public int solution(int a, int b , int[] arr) {
        int answer=0;
        int cnt =0, lt=0;
        for(int rt=0;rt<a;rt++){
            if(arr[rt]==0) cnt++;
            while(cnt>b){
                if(arr[lt]==0)cnt--;
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i] = in.nextInt();
        }
        System.out.print(T.solution(a,b,arr));
    }
}