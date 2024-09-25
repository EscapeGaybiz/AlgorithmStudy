class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] xy = new int[2];
        for (String a : keyinput) {
            if (Math.abs(xy[0]) <= board[0] / 2) {
                if (a.equals("left") && xy[0] > -board[0] / 2) {
                    xy[0] -= 1;
                } else if (a.equals("right") && xy[0] < board[0]/2) {
                    xy[0] += 1;
                }
            }
            if (Math.abs(xy[1]) <= board[1] / 2) {
                if (a.equals("up") && xy[1] < board[1] / 2) {
                    xy[1] += 1;
                } else if (a.equals("down") && xy[1] > -board[1] / 2) {
                    xy[1] -= 1;
                }
            }
        }
        return xy;
    }
}