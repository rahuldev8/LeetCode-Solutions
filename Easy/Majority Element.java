/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3

*/

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);//sorting to implement sliding window
        int n = nums.length;
        int end = n/2;
        
        for(int s=0;s<end+n%2;s++) //Signature of n/2+n%2 is Required for
                                   //Sliding Window
        {
            if(nums[s] == nums[end])
                return nums[s];
            end++;
        }
        
        return 0;
        
        //Achieved Time Complexity : o (n)
        //Space Complexity : o(1)
    }
}
