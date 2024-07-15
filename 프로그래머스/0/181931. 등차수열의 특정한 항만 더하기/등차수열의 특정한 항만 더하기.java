class Solution {
    public int solution(int a, int d, boolean[] included) {
        int sum = 0;
        int[] intArray = new int[included.length];
        for (int i = 0; i < included.length; i++) {
           intArray[i] = a + (d * i);
            if (included[i]) {
                sum += intArray[i];
            }
        }
        return sum;
    }
}