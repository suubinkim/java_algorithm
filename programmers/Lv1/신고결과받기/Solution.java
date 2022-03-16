package com.company.programmers.Lv1.신고결과받기;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

class Solution {
    //1. report에서 한 유저가 같은 유저 여러 번 신고한 경우 제외하기
    //2. map에다가 신고당한 유저 : 신고한 유저 넣기
    //3. size가 k 이상인 value 골라서 신고한 유저로 map 생성
    //4. 받을 메일 개수 출력
    public int[] solution(String[] id_list, String[] report, int k) {
        //1.
        //배열 => strem => 중복제거 => 배열
        String[] resultReport = Arrays.stream(report).distinct().toArray(String[]::new);
        //2.
        Map<String, ArrayList<String>> map = new HashMap<>();
        String reporter;
        String reported;
        for (String key : resultReport) {
            reporter = key.split(" ")[0];
            reported = key.split(" ")[1];
            ArrayList<String> reporterList = map.getOrDefault(reported, null);
            if (reporterList == null) reporterList = new ArrayList<>();

            reporterList.add(reporter);
            map.put(reported, reporterList);
        }

        //3.
        Map<String, Integer> reportUser = new HashMap<>();
        for (ArrayList<String> notifyList : map.values()) {
            if (notifyList.size() >= k) {
                for (String notify : notifyList) {
                    reportUser.put(notify, reportUser.getOrDefault(notify, 0) + 1);
                }
            }
        }

        //4.
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = reportUser.getOrDefault(id_list[i],0);
        }

        return answer;
    }
}