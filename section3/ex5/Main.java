package com.company.section3.ex5;

import java.util.*;
public class Main {

    public int solution(int n) {
        int answer=0, sum = 0,lt=0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        for(int i=0;i<n;i++){

            while(sum<=n){
                sum+= arr[i];
                if(sum==n)answer++;
            }
            if(sum>n){
                sum -= arr[lt++];
                if(sum==n) answer++;
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