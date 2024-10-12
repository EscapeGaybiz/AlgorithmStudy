import java.util.*;

/**
 * 설명
 * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
 * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
 * --
 * 입력
 * 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
 * --
 * 출력
 * 첫 줄에 소수의 개수를 출력합니다.
 * --
 * 예시 입력 1
 * 20
 * 예시 출력 1
 * 8
 */

public class Solution {
    public static void solution(int a) {
        int[] arry = new int[a + 1];
        arry[0] = arry[1] = 0;
        int cnt = 0;

        for (int i = 2; i <= a; i++) {
            arry[i] = i;
        }
        for (int i = 2; i < a; i++) {
            if (arry[i] == 0) continue;

            for (int j = i * 2; j <= a; j += i) {
                arry[j] = 0;
            }
        }

        for (int i = 0; i < arry.length; i++) {
            if (arry[i] != 0) cnt++;
        }
        System.out.println(cnt);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        solution(a);
    }
}