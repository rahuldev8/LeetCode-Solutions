class Solution {
    public int placeQueens(int col, int n,int[][] board, int[] upperleft, int[] left, int[] lowerleft){
        if(col == n){
            return 1;
        }
        int count = 0;
        for(int row = 0; row<board.length; row++){
            if(upperleft[(n-1) + col - row] == 0 && left[row] == 0 && lowerleft[row+col] == 0){
                upperleft[(n-1)+ col-row] = 1;
                left[row] = 1;
                lowerleft[col+row] = 1;
                //summing all possiblities count
                count += placeQueens(col+1, n, board, upperleft, left, lowerleft);
                upperleft[(n-1)+ col-row] = 0;
                left[row] = 0;
                lowerleft[col+row] = 0;
            }
        }
        return count;
    }
    public int totalNQueens(int n) {
        //creating chess board
        int[][] board = new int[n][n];
        int[] upperleft = new int[n*2 - 1];
        int[] left = new int[n];
        int[] lowerleft = new int[n*2 - 1];
        return placeQueens(0, n, board, upperleft, left, lowerleft);
    }
}
//TC : O(n!)
//SC : O(n^2)
