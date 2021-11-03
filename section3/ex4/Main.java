package com.company.section3.ex4;

import java.util.*;
public class Main {

    public int solution(int n,int k,int[] arr) {
        int answer=0;
        int lt = 0, rt=0;
        int sum = arr[0];
        while(rt <= k){
            if(sum < k){
                rt++;
                sum += arr[rt];
            }else if ( sum > k) {
                sum -= arr[lt++];
            }else {
                answer++;
                rt++;
                sum += arr[rt];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.print(T.solution(n,k,arr));
    }
}
