package com.company.section4.ex01;

import java.util.*;
public class Main {

    public char solution(int a, String[] arr) {
        char answer='a';
        int[] choice = new int[5];
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String[] arr = new String[a];
        for(int i=0;i<a;i++){
            arr[i] = in.next();
        }
        System.out.print(T.solution(a,arr));
    }
}
