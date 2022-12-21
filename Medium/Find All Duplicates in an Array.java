/*
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Example 2:

Input: nums = [1,1,2]
Output: [1]
Example 3:

Input: nums = [1]
Output: []
*/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        //using Constant Space 
        List<Integer> res = new ArrayList<>();

        for(int i=0; i<nums.length; i++)
        {
            int index = Math.abs(nums[i])-1;

            //if element is negative already add to list
            if(nums[index]<0)
                res.add(index+ 1);

            //if first visit make it neagtive
            nums[index] = nums[index]*-1;    
        }

        return res;
        //Time Complexity : o(n)
        //Space Complexity : o(1)  n -> arraylist
    }
}
