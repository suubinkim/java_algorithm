package com.company.programmers.Lv1.체육복;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        List<Integer> losts = Arrays.stream(lost)
                .boxed()
                .collect(Collectors.toList());
        List<Integer> reserves = Arrays.stream(reserve)
                .boxed()
                .collect(Collectors.toList());
        //여벌이 도난당했으면 둘다 배열에서 삭제
        for (int i = 0; i < reserves.size(); i++) {
            if (losts.contains(reserves.get(i))) {
                losts.remove(reserves.get(i));
                reserves.remove(i);
                answer++;
                i = -1;
            } else if (losts.contains(reserves.get(i) - 1)) {
                losts.remove(Integer.valueOf(reserves.get(i) - 1));
                reserves.remove(i);
                answer++;
                i = -1;
            } else if (losts.contains(reserves.get(i) + 1)) {
                losts.remove(Integer.valueOf(reserves.get(i) + 1));
                reserves.remove(i);
                answer++;
                i = -1;
            }
        }
        return answer;
    }
}