package com.company.section4.ex02;

import java.util.*;

public class Main {

    public String solution(String a,String b ) {
        String answer = "YES";
        char[] aa=a.toCharArray();
        Arrays.sort(aa);
        char[] bb=b.toCharArray();
        Arrays.sort(bb);
        for(int i=0;i<aa.length;i++){
            if(aa[i]!=bb[i])answer="NO";
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