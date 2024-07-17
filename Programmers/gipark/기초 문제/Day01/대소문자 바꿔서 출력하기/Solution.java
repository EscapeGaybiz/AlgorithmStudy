import java.util.Scanner;

/**
 * 대소문자 바꿔서 출력하기
 *
 * 문제 설명
 * 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
 *
 * 제한사항
 * 1 ≤ str의 길이 ≤ 20
 * str은 알파벳으로 이루어진 문자열입니다.
 * 입출력 예
 * 입력 #1
 *
 * aBcDeFg
 * 출력 #1
 *
 * AbCdEfG
 * ※2023년 05월 03일 제한사항이 수정되었습니다.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        StringBuilder sb = new StringBuilder();
        for (char c : a.toCharArray()) {
            if (Character.isUpperCase(c))
                sb.append(Character.toLowerCase(c));
            else if (Character.isLowerCase(c))
                sb.append(Character.toUpperCase(c));
        }

        System.out.println(sb.toString());
        sc.close();
    }
}