/*
Given an integer array nums, find a 
subarray
 that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

 

Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
*/

class Solution {
    public int maxProduct(int[] nums) {
        int minTemp = nums[0];
        int maxTemp = nums[0];
        int res = nums[0];

        for(int i=1; i<nums.length; i++)
        {
            //after performing maxTemp value, the value will change for minTemp calculation,
            //therefore storing it 
            int temp = maxTemp;
            maxTemp = Math.max(nums[i], Math.max(nums[i]*minTemp, nums[i]*maxTemp));
            minTemp = Math.min(nums[i], Math.min(nums[i]*minTemp, nums[i]*temp));
            res = Math.max(res, maxTemp);
        }
        return res;
        //Time Complexity : O(n)
        //Space Complexity : O(1)
    }
}
