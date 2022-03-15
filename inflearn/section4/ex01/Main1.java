package com.company.inflearn.section4.ex01;

import java.util.HashMap;
import java.util.Scanner;

public class Main1 {

    public char solution(int a, String arr) {
        char answer=' ';
        HashMap<Character,Integer> map = new HashMap<>();
        for(char x : arr.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int max = 0;
        for(char x : arr.toCharArray()){
            if(map.get(x)>max){
                max = map.get(x);
                answer=x;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String arr = in.next();
        System.out.print(T.solution(a,arr));
    }
}
