class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) { //지뢰발견 i,j
                    //x,y, / x-1, y+1 / x, y+1 / x+1,y+1 / x-1, y / x + 1, y / x-1, y-1 / x, y-1 / x+1, y-1
                    for (int x = -1; x <= 1; x++) {
                        for (int y = -1; y <= 1; y++) {
                            int newX = i + x, newY = j + y;
                            if (newX >= 0 && newX < board.length && newY >= 0 && newY < board[0].length && board[newX][newY] == 0) {
                                board[newX][newY] = -1; // 위험 지역으로 표시
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }
}