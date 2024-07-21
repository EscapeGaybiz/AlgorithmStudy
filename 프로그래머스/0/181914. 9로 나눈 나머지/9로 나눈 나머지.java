class Solution {
    public int solution(String number) {
       int answer = 0;
        for (char a : number.toCharArray()) {
            answer += Character.getNumericValue(a);
        }

        return answer % 9;
    }
}