import java.util.ArrayList;
import java.util.List;

/**
 * x 사이의 개수
 * 제출 내역
 * 문제 설명
 * 문자열 myString이 주어집니다. myString을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
 *
 * 제한사항
 * 1 ≤ myString의 길이 ≤ 100,000
 * myString은 알파벳 소문자로 이루어진 문자열입니다.
 * 입출력 예
 * myString	result
 * "oxooxoxxox"	[1, 2, 1, 0, 1, 0]
 * "xabcxdefxghi"	[0, 3, 3, 3]
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * "x"를 기준으로 문자열을 나누면 ["o", "oo", "o", "", "o", ""]가 됩니다. 각각의 길이로 배열을 만들면 [1, 2, 1, 0, 1, 0]입니다. 따라서 [1, 2, 1, 0, 1, 0]을 return 합니다.
 * 입출력 예 #2
 *
 * "x"를 기준으로 문자열을 나누면 ["", "abc", "def", "ghi"]가 됩니다. 각각의 길이로 배열을 만들면 [0, 3, 3, 3]입니다. 따라서 [0, 3, 3, 3]을 return 합니다.
 */
class Solution {
    public int[] solution(String myString) {
        List<Integer> list = new ArrayList<>();
        int[] answer = {};
        int cnt = 0;

        for (char c : myString.toCharArray()) {
            if (c != 'x') {
                cnt++;
                continue;
            }
            list.add(cnt);
            cnt = 0;
        }
        list.add(cnt);

        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}