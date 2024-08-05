import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int[] cnt = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            cnt[strArr[i].length()]++;
        }
        Arrays.sort(cnt);
        return cnt[cnt.length -1];
    }
}