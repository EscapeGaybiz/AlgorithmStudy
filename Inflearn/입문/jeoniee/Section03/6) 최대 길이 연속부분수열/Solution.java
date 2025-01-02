import java.util.*;

/**
 * 설명
 * 0과 1로 구성된 길이가 N인 수열이 주어집니다. 여러분은 이 수열에서 최대 k번을 0을 1로 변경할 수 있습니다. 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.
 * 만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면
 * 1 1 0 0 1 1 0 1 1 0 1 1 0 1
 * 여러분이 만들 수 있는 1이 연속된 연속부분수열은
 * Image1.jpg
 * 이며 그 길이는 8입니다.
 *
 * 입력
 * 첫 번째 줄에 수열의 길이인 자연수 N(5<=N<100,000)이 주어집니다.
 * 두 번째 줄에 N길이의 0과 1로 구성된 수열이 주어집니다.
 *
 * 출력
 * 첫 줄에 최대 길이를 출력하세요.
 *
 * 예시 입력 1
 * 14 2
 * 1 1 0 0 1 1 0 1 1 0 1 1 0 1
 * 예시 출력 1
 * 8
 */

public class Solution {
    public static int solution(int[] arr, int n) {
        int left = 0, right = 0, zeroCount = 0, maxCnt = 0;

        while (right < arr.length) {
            if (arr[right] == 0) {
                zeroCount++;
            }

            // zeroCount가 n을 초과하면, left 포인터를 오른쪽으로 이동하여 0을 하나씩 제거
            while (zeroCount > n) {
                if (arr[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            // 연속된 1의 최대 길이 계산
            maxCnt = Math.max(maxCnt, right - left + 1);
            right++;
        }
        return maxCnt;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();

        int[] arry = new int[input1];
        for (int i = 0; i < input1; i++) {
            arry[i] = in.nextInt();
        }
        System.out.println(solution(arry, input2));
    }
}