/*
Given a binary array nums, return the maximum number of consecutive 1's in the array.

 

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2

*/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int one = 0, ans = 0;
        
        for(int i=0;i<nums.length;i++)
        {
            //if the num is 1, increase count by 1
            if(nums[i]==1)
            {
                one++;
                //if one count is greater than max(ans), then max = one 
                if(one>ans)ans = one;
            }
            //else one count is 0, because question demands continous 1 count
            else one = 0;
        }
        return ans;
        
        //Time Complexity : o(n) 
        //Space Complexity : o(1)
        
    }
}
