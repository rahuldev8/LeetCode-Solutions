class Solution {
    public boolean isValidPlace(char[][] board, int row, int col, char target){
        for(int i=0; i<9; i++){
            //checking row
            if(board[row][i] == target)
                return false;
            //checking col
            if(board[i][col] == target)
                return false;
            //checking for submatrix
            if(board[3*(row/3) + i/3][3*(col/3) + i%3] == target)
                return false;        
        }
        return true;
    }
    public boolean helper(char[][] board){
        //traversing the matrix
        for(int row=0; row<9; row++){
            for(int col=0; col<9; col++){
                //if empty cell found, try to fill it
                if(board[row][col] == '.'){
                    //trying from 1 to 9
                    for(char num='1'; num<='9'; num++){
                        //if it is valid place
                        if(isValidPlace(board, row, col, num)){
                            board[row][col] = num;
                        //only one valid arrangement is need to be found    
                        if(helper(board))
                            return true;
                        //backtracks
                        board[row][col] = '.';
                        }
                    }
                    //if no element can be filled
                    return false;
                }
            }
        }
        //if all are successfully placed
        return true;
    }
    public void solveSudoku(char[][] board) {
        helper(board);
    }
}
//TC : O(9 ^ n * n)
//SC : O(n)
