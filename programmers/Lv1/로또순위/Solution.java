package com.company.programmers.Lv1.로또순위;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero = 0;
        int same = 0;
        //0의 개수
        for (int lotto : lottos) {
            if (lotto == 0) zero++;
        }
        //같은 숫자 개수
        for (int lotto : lottos) {
            for (int j = 0; j < lottos.length; j++) {
                if (lotto == win_nums[j]) same++;
            }
        }
        //순위 추가
        answer[0] = rank(same+zero);
        answer[1] = rank(same);
        return answer;
    }

    public int rank(int same){
        if(same==6) return 1;
        if(same==5) return 2;
        if(same==4) return 3;
        if(same==3) return 4;
        if(same==2) return 5;
        return 6;
    }
}