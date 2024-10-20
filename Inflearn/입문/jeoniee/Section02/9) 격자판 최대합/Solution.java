import java.util.*;

/**
 *설명
 * 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
 * Image1.jpg
 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
 *
 * 입력
 * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
 * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
 *
 * 출력
 * 최대합을 출력합니다.
 *
 * 예시 입력 1
 * 5
 * 10 13 10 12 15
 * 12 39 30 23 11
 * 11 25 50 53 15
 * 19 27 29 37 27
 * 19 13 30 13 19
 *
 * 예시 출력 1
 * 155
 */

public class Solution {
    public static int solution(int[][] b) {
        int rowMax = Integer.MIN_VALUE, columnMax = Integer.MIN_VALUE;
        int crossMaxLeft = 0, crossMaxRight = 0;
        for (int i = 0; i < b.length; i++) {
            int rowSum = 0, columnSum = 0;
            for (int j = 0; j < b.length; j++) {
                rowSum += b[i][j];    // 행
                columnSum += b[j][i]; // 열
            }
            rowMax = Math.max(rowMax, rowSum);
            columnMax = Math.max(columnMax, columnSum);

            crossMaxLeft += b[i][i];                      // 왼쪽 -> 오른쪽 대각선 합
            crossMaxRight += b[i][b.length - i - 1];      // 오른쪽 -> 왼쪽 대각선 합
        }

        return Math.max(Math.max(rowMax, columnMax), Math.max(crossMaxLeft, crossMaxRight));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] b = new int[a][a];
        for (int i = 0; i < a; i++) {
            sc.nextLine();
            for (int j = 0; j < a; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(b));
    }
}