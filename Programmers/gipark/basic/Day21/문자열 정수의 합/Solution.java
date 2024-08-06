/**
 * 문자열 정수의 합
 * 제출 내역
 * 문제 설명
 * 한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 3 ≤ num_str ≤ 100
 * 입출력 예
 * num_str	result
 * "123456789"	45
 * "1000000"	1
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * 문자열 안의 모든 숫자를 더하면 45가 됩니다.
 * 입출력 예 #2
 *
 * 문자열 안의 모든 숫자를 더하면 1이 됩니다.
 */
class Solution {
    public int solution(String num_str) {
        int answer = 0;

        for (char c : num_str.toCharArray()) {
            answer += c - 48;
        }
        return answer;
    }
}

/**
 * 타입별 우선순위
 * 작은 타입 -> 큰 타입
 *
 * byte: 8비트 정수
 * short: 16비트 정수
 * char: 16비트 무부호 정수(Unicode)
 * int: 32비트 정수
 * long: 64비트 정수
 * float: 32비트 부동소수점
 * double: 64비트 부동소수점
 *
 * ==========================================
 *
 * byte는 short, int, long, float, double로 변환될 수 있음
 * short는 int, long, float, double로 변환될 수 있음
 * char는 int, long, float, double로 변환될 수 있음
 * int는 long, float, double로 변환될 수 있음
 * long은 float, double로 변환될 수 있음
 * float는 double로 변환될 수 있음
 *
 */