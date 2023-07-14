class Solution {
    public List<String> construct(char[][] board, int n){
        List<String> temp = new ArrayList<>();
        for(int row = 0; row<n; row++){
            String str = new String(board[row]);
            temp.add(str);
        }
        return temp;
    }
    public void placeQueens(int col, int n, char[][] board, int[] left, int[] upperleft, int[] lowerleft, List<List<String>> result){
        //base case
        if(col == n){
            result.add(construct(board, n));
            return ;
        }

        for(int row = 0; row<n; row++){
            //if all conditions are satisfied, a queen can be placed there
            if(left[row] == 0 && upperleft[(n-1) + col - row] == 0 && lowerleft[row+col] == 0){
                board[row][col] = 'Q';
                left[row] = 1;
                upperleft[(n-1)+col-row] = 1;
                lowerleft[row+col] = 1;
                //serach place for next queen
                placeQueens(col+1, n, board, left, upperleft, lowerleft, result);
                //backtracks, clear the placed queens
                board[row][col] = '.';
                left[row] = 0;
                upperleft[(n-1)+col-row] = 0;
                lowerleft[row+col] = 0;
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        //Creating Chess board
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        List<List<String>> result = new ArrayList<>();
        //hasing arrays to find Queen's position
        int[] left = new int[n];
        int[] upperleft = new int[n*2 - 1];
        int[] lowerleft = new int[n*2 - 1];
        placeQueens(0, n, board, left, upperleft, lowerleft, result);
        return result;
    }
}
//TC: O(n!)
//SC : O(n^2)
