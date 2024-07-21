import java.util.Scanner;

/**
 * 홀짝 구분하기
 * 제출 내역
 * 문제 설명
 * 자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.
 * <p>
 * 제한사항
 * 1 ≤ n ≤ 1,000
 * 입출력 예
 * 입력 #1
 * <p>
 * 100
 * 출력 #1
 * <p>
 * 100 is even
 * 입력 #2
 * <p>
 * 1
 * 출력 #2
 * <p>
 * 1 is odd
 * ※ 2023년 05월 15일 지문이 수정되었습니다.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String str = switch (n % 2) {
            case 0 -> str = "even";
            case 1 -> str = "odd";
            default -> throw new IllegalStateException("Unexpected value: " + (n % 2));
        };

        System.out.println(n + " is " + str);

        sc.close();
    }
}