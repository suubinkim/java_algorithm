package com.company.section4.ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int n, int k, int[] arr ) {
        ArrayList<Integer> answer = new ArrayList<>();
        int lt=0 , rt= k-1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<k;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        answer.add(map.size());
        while(rt<n){
            rt++;
            if(rt==n)break;
            map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
            if(map.get(arr[lt])>1){
                map.put(arr[lt],map.getOrDefault(arr[lt],0)-1);
            }else {
                map.remove(arr[lt]);
            }
            answer.add(map.size());
            lt++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k= in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        for(int x : T.solution(n,k,arr)) System.out.print(x+" ");
    }
}
