import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 소인수분해
 * 제출 내역
 * 문제 설명
 * 소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다. 예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다. 따라서 12의 소인수는 2와 3입니다. 자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 2 ≤ n ≤ 10,000
 * 입출력 예
 * n	result
 * 12	[2, 3]
 * 17	[17]
 * 420	[2, 3, 5, 7]
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * 12를 소인수분해하면 2 * 2 * 3 입니다. 따라서 [2, 3]을 return합니다.
 * 입출력 예 #2
 *
 * 17은 소수입니다. 따라서 [17]을 return 해야 합니다.
 * 입출력 예 #3
 *
 * 420을 소인수분해하면 2 * 2 * 3 * 5 * 7 입니다. 따라서 [2, 3, 5, 7]을 return합니다.
 */
class Solution2 {
    public int[] solution(int n) {
        int[] answer = {};
        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                if (isPrime(i))
                    set.add(i);
            }
        }

        int idx = 0;
        answer = new int[set.size()];
        for (int num : set) {
            answer[idx++] = num;
        }
        return answer;
    }

    private boolean isPrime(int n) {
        boolean b = true;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                b = false;
        }
        return b;
    }
}

/**
 * HashSet은 삽입순서를 고려하지 않기때문에 set의 요소를 찾을때, 어떤 수로 반환될지 예측 불가함
 * 따라서, 삽입순서를 유지해주는 LinkedHashSet을 사용
 */