/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

 

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
*/

class Solution {
    public int findDuplicate(int[] nums) {

        //Using Nikil's Marking Negative Technique
        for(int i=0; i<nums.length; i++)
        {
            int index = Math.abs(nums[i])-1;

            //if already marked as negative return it
            if(nums[index] < 0)
                return index+1;
            //else mark it negative
            else
                nums[index] = nums[index]*-1;    
        }
        return -1;
        //Time Complexity : o(n)
        //Space Complexity : o(1)
    }
}
