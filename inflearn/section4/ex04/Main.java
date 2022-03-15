package com.company.inflearn.section4.ex04;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public int solution(String s, String t) {
        int answer =0;
        int lt=0;
        char[] arr = s.toCharArray();
        HashMap<Character,Integer> ss = new HashMap<>();
        HashMap<Character,Integer> tt = new HashMap<>();

        for(int i=0;i<t.length()-1;i++){
            ss.put(arr[i],ss.getOrDefault(arr[i],0)+1);
        }

        for(char x : t.toCharArray()){
            tt.put(x,tt.getOrDefault(x,0)+1);
        }

        for(int rt=t.length()-1;rt<s.length();rt++){;
            ss.put(arr[rt],ss.getOrDefault(arr[rt],0)+1);
            if(ss.equals(tt))answer++;
            ss.put(arr[lt],ss.getOrDefault(arr[lt],0)-1);
            if(ss.get(arr[lt])==0)ss.remove(arr[lt]);
            lt++;
        }


        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
            System.out.print(T.solution(s,t));
    }
}
