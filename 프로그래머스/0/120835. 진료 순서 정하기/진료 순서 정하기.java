import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        Map<Integer, Integer> map = new HashMap<>();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < emergency.length; i++) {
            map.put(emergency[i], i); //인덱스, 값
            list.add(emergency[i]);
        }

        Collections.sort(list, Collections.reverseOrder()); //내림차순으로 정렬

        int[] result = new int[emergency.length];
        for (int i = 0; i < list.size(); i++) {
            result[map.get(list.get(i))] = i + 1;
        }
        return result;
    }
}