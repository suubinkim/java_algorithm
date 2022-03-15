package com.company.inflearn.section3.ex2;

import java.util.*;
public class Main {

    public List<Integer> solution(int a, int b, int[] arr1, int[] arr2) {
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int p=0,q=0;
        while(p<a && q <b){
            if(arr1[p]<arr2[q])p++;
            else if (arr1[p]>arr2[q])q++;
            else {
                answer.add(arr1[p++]);
                q++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] arr1 = new int[a];
        for(int i=0;i<a;i++){
            arr1[i] = in.nextInt();
        }
        int b = in.nextInt();
        int[] arr2 = new int[b];
        for(int i=0;i<b;i++){
            arr2[i] = in.nextInt();
        }

        for(int x : T.solution(a,b,arr1,arr2)) System.out.print(x+" ");
    }
}
