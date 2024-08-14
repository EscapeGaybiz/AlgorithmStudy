class Solution {
    public int[] solution(int money) {
        int cups = money / 5500; //최대 아메 잔..
        int charge = money % 5500; //남은 돈
        return new int[]{cups, charge};
    }
}