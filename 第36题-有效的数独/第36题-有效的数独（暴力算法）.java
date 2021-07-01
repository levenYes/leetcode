class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean isValidSudoku = true;
        if(!isValidColumn(board)) {
          isValidSudoku = false;
        }
        if(!isValidRow(board)) {
          isValidSudoku = false;
        }
        if(!isValidNines(board)) {
          isValidSudoku = false;
        }

        return isValidSudoku;
    }

    private boolean isValidColumn(char[][] board) {
      for(int i=0; i < 9; i++) {
        Set charSet = new HashSet<String>();
        for(int j=0; j < 9;j++) {
          if(board[i][j] != '.') {
            if(!charSet.add(board[i][j])){
              return false;
            }
          }
        }
      }
      return true;
    }

    private boolean isValidRow(char[][] board) {
      for(int i=0; i < 9; i++) {
        Set charSet = new HashSet<String>();
        for(int j=0; j < 9;j++) {
          if(board[j][i] != '.') {
            if(!charSet.add(board[j][i])){
              return false;
            }
          }
        }
      }
      return true;
    }

    private boolean isValidNines(char[][] board) {
      int x = 0;
      int y = 0;
      boolean isValidNine = true;
      while(isValidNine && x < 7){
        y = 0;
        while(isValidNine && y < 7) {
          isValidNine = isValidNine(board, x, y);
          y = y + 3;
        }
        x = x + 3;
      }

      return isValidNine;
    }

    private boolean isValidNine(char[][] board, int x, int y) {
      Set charSet = new HashSet<String>();
      //这样写是不对的
      //for(int i = x; i< i+3; i ++)
      for(int i = x; i< x+3; i ++) {
        for(int j = y; j< y+3; j++) {
          if(board[i][j] != '.') {
            if(!charSet.add(board[i][j])){
              return false;
            }
          }
        }
      }

      return true;
    }
}
