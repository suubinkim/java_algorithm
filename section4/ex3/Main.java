package com.company.section4.ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public int[] solution(int n, int k, int[] arr ) {
        int[] answer = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> test = new ArrayList<>();
        for(int i=0;i<k;i++){
            test.add(arr[i]);
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
        for(int key : map.keySet()) {
            answer[0]++;
        }
        int tt = 1;
        while(tt<k){
            for(int i=k;i<n;i++){
                map.clear();
                test.add(arr[i]);
                test.remove(0);
                for(int j=0;j<k;j++){
                    map.put(arr[j],map.getOrDefault(arr[j],0)+1);
                }
            }
            for(int key : map.keySet()) {
                answer[tt]++;
            }
            tt++;
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
