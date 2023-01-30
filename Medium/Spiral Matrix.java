/*
Given an m x n matrix, return all elements of the matrix in spiral order.

 

Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:


Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

*/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int start_row=0,start_col=0;
        int end_row = matrix.length-1;
        int end_col = matrix[0].length-1;

        while(start_row <= end_row && start_col <= end_col)
        {
            //Right direction
            for(int i=start_col; i<=end_col; i++)
                res.add(matrix[start_row][i]);

            start_row++;

            //Down Direction
            for(int i=start_row; i<=end_row; i++)
                res.add(matrix[i][end_col]);

            end_col--;

            //left Direction
            if(start_row<=end_row)
            {
                for(int i=end_col; i>=start_col; i--)
                    res.add(matrix[end_row][i]);
            }
            end_row--;    

            //Up Direction
            if(start_col <= end_col)
            {
                for(int i=end_row; i>=start_row; i--)
                    res.add(matrix[i][start_col]);
            }    
            start_col++;
        }

        return res;
        //Time Complexity : O(n^2)
        //Space Complexity : O(n)
        
    }
}
