/*
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
 

Example 1:


Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
Output: true
Example 2:


Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
Output: false
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = 0, col = matrix[0].length-1;

        while(row<matrix.length && col>=0)
        {
            if(matrix[row][col]==target)return true;

            else if(matrix[row][col]<target) row++;

            else col--;
        }
        return false;
    }
    //Time Complexity : ~O(n) -> Worst Case(target not found)
    //Space Complexity : o(1)
}
