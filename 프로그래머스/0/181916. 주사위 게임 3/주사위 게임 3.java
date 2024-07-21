import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        Map<Integer, Integer> cnt = IntStream.of(a, b, c, d)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.summingInt(e -> 1)));

        List<Map.Entry<Integer, Integer>> sort = cnt.entrySet().stream() // 빈도수와 숫자 정렬
                .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                .collect(Collectors.toList());

        switch (sort.size()) {
            case 1: // 4개가 같을 때
                answer = 1111 * sort.get(0).getKey();
                break;
            case 4: // 4개가 모두 다를 때
                answer = IntStream.of(a, b, c, d).min().orElse(0);
                break;
            case 2: 
                int first = sort.get(0).getKey();
                int second = sort.get(1).getKey();
                int firstCnt = sort.get(0).getValue();
                int secondCnt = sort.get(1).getValue();

                if (firstCnt == 2 && secondCnt == 2) { // 두 개씩 같은 값
                    answer = (first + second) * Math.abs(first - second);
                } else if (firstCnt == 3 && secondCnt == 1){ //3개가 같고 1개가 다를 때
                    answer = (int) Math.pow(10 * first + second, 2);
                } else {
                    answer = (int) Math.pow(10 * second + first, 2);
                }
                break;
            case 3: // 3개, 1개일 때
                int firstNum = sort.get(0).getKey();
                int secondNum = sort.get(1).getKey();
                int thirdNum = sort.get(2).getKey();
                answer = (firstNum == 2) ? secondNum * thirdNum : secondNum * thirdNum;
                break;
        }
        return answer;
    }
}