package com.company.section2;

import java.util.*;

public class Main {
    public int[] solution(int t,int[] num) {
        int[] answer = new int[t];

        for(int i=0;i<t;i++){
            int rank = 1;
            for(int j=0;j<t;j++){
                if(num[i]<num[j]){
                    rank++;
                }
            }
            answer[i]=rank;
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] num = new int[t];
        for(int i=0;i<t;i++){
            num[i] = in.nextInt();
        }
        for(int x : T.solution(t,num)) System.out.print(x+" ");
    }
}
