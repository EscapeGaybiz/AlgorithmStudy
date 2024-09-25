class Solution {
    public int solution(int chicken) {
        int free = 0;
        while (chicken >= 10) {
            free += chicken / 10;
            chicken = chicken / 10 + chicken % 10;
        }
        return free;
    }
}