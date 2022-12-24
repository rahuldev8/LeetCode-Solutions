/*
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
*/
class Solution {
    public int search(int[] nums, int target) {
        //sanity check
        if(nums.length==0 || nums==null) return -1;

        //Binary Search

        int start = 0;
        int end = nums.length-1;

        while(start<=end)
        {
            int mid = start + (end - start) / 2;
            
            //case 1 : if target found return it's index
            if(nums[mid] == target) return mid;

            //case 2 : check the left array is sorted && target lies between the range
            if(nums[start] <= nums[mid])  
            {
                //checking target in in given range
                if(target >= nums[start] && target <= nums[mid])
                    end = mid - 1;
                else
                    start = mid + 1;    
            }
            //case 3 : if right array is sorted
            else
            {
                //checking target is in given range
                if(target >= nums[mid] && target <= nums[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        //if(target==nums[start])return start;
        //if(target==nums[end])return end;
        //case 4: if target is not found
        return -1;
        
        //Time Complexity : o(log N) binary search
        //Space Complexity : o(1)
    }
}
