class Solution {
    public int solution(int[] date1, int[] date2) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < date1.length; i++) {
            a.append(date1[i]);
            b.append(date2[i]);
        }
        return Integer.parseInt(a.toString()) < Integer.parseInt(b.toString()) ? 1 : 0;
    }
}