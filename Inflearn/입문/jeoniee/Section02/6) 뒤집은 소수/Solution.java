import java.util.*;

/**
 * 설명
 * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
 * 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
 * 첫 자리부터의 연속된 0은 무시한다.
 * --
 * 입력
 * 첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
 * 각 자연수의 크기는 100,000를 넘지 않는다.
 * --
 * 출력
 * 첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
 * --
 * 예시 입력 1
 * 9
 * 32 55 62 20 250 370 200 30 100
 * 예시 출력 1
 * 23 2 73 2 3
 */

public class Solution {
    public static void solution(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            String reversed = new StringBuilder(String.valueOf(a[i])).reverse().toString();
            b[i] = Integer.parseInt(reversed);
        }

        for (int i = 0; i < b.length; i++) {
            if (b[i] < 2 || !isPrime(b[i])) {
                b[i] = 0; //소수가 아니면 0으로 만듬
            }
        }

        for (int r : b) {
            if (r != 0) System.out.print(r + " ");
        }
    }

    public static boolean isPrime(int a) {
        if (a < 2) return false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        int[] b = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }
        solution(b);
    }
}