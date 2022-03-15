package com.company.inflearn.section4.ex02;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public String solution(String a,String b ) {
        String answer = "YES";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char x : a.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(char x : b.toCharArray()){
            map.put(x,map.getOrDefault(x,0)-1);
            if(map.get(x)<0){
                answer="NO";
                break;
            }

        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.print(T.solution(a,b));
    }
}
