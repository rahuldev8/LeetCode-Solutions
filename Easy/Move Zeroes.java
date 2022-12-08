/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]

*/

class Solution {
    public void moveZeroes(int[] nums) {
        //count for number of non-zer elements in given array
        int noZero = 0;

        for(int i=0;i<nums.length;i++)
        {
            //if current element is not zero, copy to the first of nums array
            if(nums[i]!=0)
                nums[noZero++] = nums[i];
        }

        //making the remaining last element as zero
        for(int i=noZero; i<nums.length; i++)
            nums[i] = 0;
        //Time Complexity : o(n)
        //Space Complexity : o(1)
    }
}
