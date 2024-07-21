import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] arr = {a, b, c, d};
        Arrays.sort(arr);

        if (arr[0] == arr[3]) { // 4개가 같을 때
            answer = 1111 * arr[0];
        } else if (arr[0] == arr[2] || arr[1] == arr[3]) { // 3개만 같을 때
            answer = (arr[0] == arr[2]) ? (int) Math.pow(10 * arr[0] + arr[3], 2)
                    : (int) Math.pow(10 * arr[3] + arr[0], 2);
        } else if (arr[0] == arr[1] && arr[2] == arr[3]) { // 2개씩 같을 때
            answer = (arr[0] + arr[2]) * Math.abs(arr[0] - arr[2]);
        } else if (arr[0] == arr[1] || arr[1] == arr[2] || arr[2] == arr[3]) { // 2개 같고, 1개, 1개
            answer = (arr[0] == arr[1]) ? arr[2] * arr[3] : (arr[1] == arr[2]) ? 
                    arr[0] * arr[3] : arr[0] * arr[1];
        } else { // 모두 다를 때
            answer = arr[0];
        }

        return answer;
    }
}