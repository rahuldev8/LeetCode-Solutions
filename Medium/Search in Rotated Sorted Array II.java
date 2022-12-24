/*
There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).

Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].

Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.

You must decrease the overall operation steps as much as possible.

 

Example 1:

Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true
Example 2:

Input: nums = [2,5,6,0,0,1,2], target = 3
Output: false
*/

class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start<=end)
        {
            int mid = start+(end-start)/2;
            //case 1: if target found
            if(nums[mid]==target)return true;

            //special edge case(Maybe Binary Elements)
            if(nums[start]==nums[mid] && nums[mid]==nums[end])
            {
                start++;
                end--;
            }
            //case 2: if left array is sorted
            else if(nums[start]<=nums[mid])
            {
                if(nums[start]<=target && nums[mid]>target)
                    end = mid-1;
                else
                    start = mid+1;    
            }
            //case 3: if right array is sorted
            else
            {
                if(nums[mid]<target && nums[end]>=target)
                    start = mid+1;
                else
                    end=mid-1;     
            }
        }
        return false;
        //Time Complexity : O(log n)
        //Space Complexity : O(1)
    }
}
