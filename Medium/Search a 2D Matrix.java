/*
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
 

Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        //Binary Search using Imaginary Index
        int row = matrix.length;// number of rows
        int col = matrix[0].length;//number of coloumns

        //usual binary search
        int start = 0;
        int end = (row*col)-1;

        while(start<=end)
        {
            int mid = start + (end - start) /2;

            //index can be found using / and % of col number in mid value
            if(matrix[mid/col][mid%col]==target)return true;

            if(matrix[mid/col][mid%col] < target)
                start = mid + 1;
            else
                end = mid - 1;    
        }
        return false;

        //Time Complexity : o(log n*m)
        //Space Complexity : o(1)
    }
}
