/*
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.

 

Example 1:

Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.
Example 2:

Input: nums = [4,5,6,7,0,1,2]
Output: 0
Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
Example 3:

Input: nums = [11,13,15,17]
Output: 11
Explanation: The original array was [11,13,15,17] and it was rotated 4 times.
*/

class Solution {
    public int findMin(int[] nums) {
        //if rotated and got original array
        if(nums[0]<nums[nums.length-1])return nums[0];
        //if array has a single element
        if(nums.length==1)return nums[0];

        int res = Integer.MAX_VALUE;
        int start = 0,end = nums.length-1;

        while(start<=end)
        {
            int mid = start+(end-start)/2;
            //if min is in second part
            if(nums[0]<=nums[mid])
                start = mid+1;
            //if min is in first part    
            else
            {
                res = Math.min(res, nums[mid]);
                end = mid-1;
            }    
        }
        return res;  
        //Time Complexity : o(log n)
        //Space Complexity : o(1)
    }
}
