/*
Given an integer array nums, find the subarray which has the largest sum and return its sum.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23

*/

class Solution {
    public int maxSubArray(int[] nums) {
        //max sum and current sum to the first element of array
        int max = nums[0],curr=nums[0];
        //traversing to the remaing array
        for(int i=1;i<nums.length;i++)
        {
            //now store the max of i-th element and i-th element+curr sum
            curr = Math.max(nums[i],curr+nums[i]);
            //if current is larger than final max, update there
            if(curr>max)max=curr;
        }
        return max;
        
        //Time Complexity: o(n)
        //Space Complexity: o(1)
    }
}
