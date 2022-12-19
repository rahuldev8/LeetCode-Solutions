/*
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

 

Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
Example 2:


Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
*/
class Solution {
    public void rotate(int[][] matrix) {
        //Clockwise Roation of an Matrix

        //Step 1 : Transpose the given matrix
        int row = matrix.length;
        int col = matrix[0].length;

        for(int i=0; i<row; i++)
        {
            for(int j=i; j<col; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        //Step 2: reverse each row in transposed matrix
        for(int i=0; i<row; i++)
        {
            int start = 0;
            int end = col-1;

            while(start<end)
            {
                int temp = matrix[i][start];
                matrix[i][start++] = matrix[i][end];
                matrix[i][end--] = temp;
            }
        }
        //Space Complexity : o(n*n)
        //Time Complexity : o(1)
    }
}
