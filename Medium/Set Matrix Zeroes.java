/*
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.

 

Example 1:


Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Example 2:


Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

*/

class Solution {
    public void setZeroes(int[][] matrix) {
        //Algorithm : 
        /*
        1. check first row for zeros
        2. check first col for zeros
        3. mark first row and col values to zero, with respect to inner matrix
        4. fill the values in inner matrix, with obtained data
        5. fill first row values
        6. fill first col values
        */

        //flag for to set zeros in first row and col
        boolean zeroRow = false;
        boolean zeroCol = false;

        //step 1: check zeros in first row
        for(int j=0; j<matrix[0].length; j++)
        {
            if(matrix[0][j]==0)
            {
                zeroRow = true;
                break;
            }
        }
        //step 2: check zeros in first column
        for(int i=0; i<matrix.length; i++)
        {
            if(matrix[i][0]==0)
            {
                zeroCol = true;
                break;
            }
        }
        //step 3: mark zero values in first row and col
        for(int i=1; i<matrix.length; i++)
        {
            for(int j=1; j<matrix[0].length; j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        //step 4: fill values in inner matrix
        for(int i=1; i<matrix.length; i++)
        {
            for(int j=1; j<matrix[0].length; j++)
            {
                if(matrix[i][0]==0 || matrix[0][j]==0)
                    matrix[i][j] = 0;
            }
        }
        //step 5: process first row
        if(zeroRow==true)
        {
            for(int j=0; j<matrix[0].length; j++)
                matrix[0][j] = 0;
        }
        //step 6: process first col
        if(zeroCol==true)
        {
            for(int i=0; i<matrix.length; i++)
                matrix[i][0] = 0;
        }

        //Time Complexity : o(n*m)
        //Space Complexity : o(1)
        
    }
}
