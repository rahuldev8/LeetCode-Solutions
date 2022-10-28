/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space*/

class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i=0;i<nums.length;i++)
        {
            res ^= nums[i];
        }
        return res;
        
        //Achieved Time Complexity : o (n)
        //Space Complexity : o(1)
    }
}


//Approach 2

class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            int count =0;
            for(int j=0;j<n;j++)
            {
                if(nums[i] == nums[j])count++;
            }
            if(count == 1)
                return nums[i];
        }
        return 0;
        
        //Achieved Time Complexity : o (n^2)
        //Space Complexity : o(1)
    }
}
