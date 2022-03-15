package com.company.inflearn.section4.ex05;

import java.util.*;

public class Main {
    public int solution(int n,int l ,int[] arr) {
        int answer;
        ArrayList<Integer> sum = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    sum.add(arr[i]+arr[j]+arr[k]);
                }
            }
        }
        TreeSet<Integer> sum2 = new TreeSet<>(sum);
        ArrayList<Integer> sum3 = new ArrayList<>(sum2);
        Collections.sort(sum3,Collections.reverseOrder());
        if(sum3.size()>l){
            answer = sum3.get(l-1);
        }else answer = -1;


        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.print(T.solution(n,l,arr));
    }
}
