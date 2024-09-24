import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            list.add(new int[]{score[i][0] + score[i][1], i});
        }
        list.sort((a, b) -> b[0] - a[0]);
        
        int rank = 1;
        int[] answer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            if (i > 0 && list.get(i)[0] != list.get(i - 1)[0]) rank = i + 1;
            answer[list.get(i)[1]] = rank;
        }
        return answer;
    }
}