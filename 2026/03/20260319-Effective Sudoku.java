class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rowHas = new boolean[9][9]; 
        boolean[][] colHas = new boolean[9][9];
        boolean[][][] subBoxHas = new boolean[3][3][9]; 

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char b = board[i][j];
                if (b == '.') {
                    continue;
                }
                int x = b - '1';
                if (rowHas[i][x] || colHas[j][x] || subBoxHas[i / 3][j / 3][x]) { 
                    return false;
                }
              
                rowHas[i][x] = colHas[j][x] = subBoxHas[i / 3][j / 3][x] = true;
            }
        }

        return true;
    }
}