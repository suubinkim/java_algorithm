package com.company.inflearn.section3.ex5;

import java.util.*;
public class Main {

    public int solution(int n) {
        int answer=0, sum = 0;
        int lt=0;
        int[] arr = new int[n/2+1];
        for(int i=0;i<n/2+1;i++){
            arr[i]=i+1;
        }
        for(int rt=0;rt<n/2+1;rt++){
            sum += arr[rt];
            if(sum==n) answer++;
            while(sum>=n){
                sum-=arr[lt++];
                if(sum==n)answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(T.solution(n));
    }
}