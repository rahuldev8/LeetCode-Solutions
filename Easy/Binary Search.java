/*
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
*/

class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        
        while(start<=end)
        {
            int mid = start + (end - start) / 2;
            
            if(target < nums[mid]) end = mid-1;
            if(target > nums[mid]) start = mid+1;
            if(target == nums[mid]) return mid;
        }
        return -1;
        
        //Time Complexity : o(log N)
        //Space Complexity : o(1)
        
    }
}
