import java.util.Arrays;

/**
 * 한 번만 등장한 문자
 * 제출 내역
 * 문제 설명
 * 문자열 s가 매개변수로 주어집니다. s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요. 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
 *
 * 제한사항
 * 0 < s의 길이 < 1,000
 * s는 소문자로만 이루어져 있습니다.
 * 입출력 예
 * s	result
 * "abcabcadc"	"d"
 * "abdc"	"abcd"
 * "hello"	"eho"
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * "abcabcadc"에서 하나만 등장하는 문자는 "d"입니다.
 * 입출력 예 #2
 *
 * "abdc"에서 모든 문자가 한 번씩 등장하므로 사전 순으로 정렬한 "abcd"를 return 합니다.
 * 입출력 예 #3
 *
 * "hello"에서 한 번씩 등장한 문자는 "heo"이고 이를 사전 순으로 정렬한 "eho"를 return 합니다.
 */
class Solution {
    public String solution(String s) {
        String answer = s;
        char[] chArr;

        for (char c : answer.toCharArray()) {
            if (answer.indexOf(c, answer.indexOf(c) + 1) != -1) {
                answer = answer.replace(String.valueOf(c), "");
            }
        }

        chArr = answer.toCharArray();
        Arrays.sort(chArr);

        return new String(chArr);
    }
}