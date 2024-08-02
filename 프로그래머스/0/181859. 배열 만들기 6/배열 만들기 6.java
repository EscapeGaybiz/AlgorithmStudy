import java.util.Stack;
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        for (int a : arr) {
            if (stk.isEmpty() || stk.peek() != a) {
                stk.push(a);
            } else {
                stk.pop();
            }
        }
        return stk.isEmpty() ? new int[]{-1} : stk.stream().mapToInt(i -> i).toArray();
    }
}