package com.company.section4.ex04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public int solution(String s, String t) {
        int answer =0;
        int lt=0, rt=t.length()-1;
        int cnt = 0;
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<t.length();i++){
            map.put(ss[i],map.getOrDefault(ss[i],0)+1);
        }
        while(rt<s.length()){
            for(char x : tt){
                if(map.containsKey(x)){
                    if(map.get(x)==1)cnt++;
                }else break;
            }
            if(cnt==t.length())answer++;
            rt++;
            if(rt==s.length())break;
            map.put(ss[rt],map.getOrDefault(ss[rt],0)+1);
            map.put(ss[lt],map.get(ss[lt])-1);
            if(map.get(ss[lt])==0){
                map.remove(ss[lt]);
            }
            cnt=0;
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
