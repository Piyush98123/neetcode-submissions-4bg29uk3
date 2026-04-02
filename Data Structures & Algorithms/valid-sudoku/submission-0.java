class Solution {
    public boolean isValidSudoku(char[][] board) {
         for(int i=0;i<board.length;i++){
            for (int j = 0; j < board[i].length ; j++) {
                if(board[i][j]=='.') continue;
                boolean flag = isValid(board, i, j, board[i][j]);
                if(!flag) return flag;

            }
        }
        return true;
    }

    public boolean isValid(char[][] board, int r, int c, char ch){

        for(int col=0;col<board[r].length;col++){
            if(col != c && board[r][col]==ch) return false;
        }

        for(int row=0;row<board.length;row++){
            if(row != r && board[row][c]==ch) return false;
        }

        int srow = (r/3)*3;
        int scol = (c/3)*3;
        for (int i = srow; i < srow+3; i++) {
            for (int j = scol; j < scol+3 ; j++) {
                if(i==r || j==c) continue;
                if(board[i][j]==ch)return false;
            }
        }
        return true;
    }
}
