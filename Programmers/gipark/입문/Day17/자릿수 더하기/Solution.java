/**
 * 자릿수 더하기
 * 제출 내역
 * 문제 설명
 * 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
 *
 * 제한사항
 * 0 ≤ n ≤ 1,000,000
 * 입출력 예
 * n	result
 * 1234	10
 * 930211	16
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * 1 + 2 + 3 + 4 = 10을 return합니다.
 * 입출력 예 #2
 *
 * 9 + 3 + 0 + 2 + 1 + 1 = 16을 return합니다.
 */
class Solution {
    public int solution(int n) {
        int answer = 0;
        int digitCount = (int) Math.log10(n);

        for (int i = digitCount; i >= 0; i--) {
            answer += n / (int) Math.pow(10, i);
            n = n % (int) Math.pow(10, i);
        }
        return answer;
    }
}