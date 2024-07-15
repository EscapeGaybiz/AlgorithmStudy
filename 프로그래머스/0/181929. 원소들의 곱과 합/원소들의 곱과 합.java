class Solution {
    public int solution(int[] num_list) {
        int answer = 1; //곱
        int answer1 = 0; //합
        for (int elements : num_list) {
            answer *= elements; //모든 원소의 곱
            answer1 += elements;//모든 원소들의 합의 제곱
        }
        return answer < Math.pow(answer1, 2) ? 1 : 0;
    }
}