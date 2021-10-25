package com.company.section2;

import java.util.*;

public class Main {
    public boolean isPrime(int num) {
        if(num==1) return false;
        for(int i=2;i<num;i++) {
            if(num%i==0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int t,int[] num) {
        ArrayList<Integer> answer= new ArrayList<>();
        for(int i=0;i<t;i++) {
            int rev = 0;
            while (num[i]>0) {
                int digit =  num[i] % 10;
                rev = rev * 10 + digit;
                num[i] = num[i]/10;
            }
            if(isPrime(rev)) answer.add(rev);
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] num = new int[t];
        for(int i=0;i<t;i++) {
            num[i]=in.nextInt();
        }
        for(int x : T.solution(t,num)) System.out.print(x+" ");
    }
}