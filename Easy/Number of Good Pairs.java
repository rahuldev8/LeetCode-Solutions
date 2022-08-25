/*
Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.

 

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.


Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.


Example 3:

Input: nums = [1,2,3]
Output: 0
 

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100*/


class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq_arr = new int[102];
        
        for(int n : nums)
        {
            freq_arr[n]++;
        }
        int pairs = 0;
        
        for(int i : freq_arr)
        {
            pairs += (i*(i-1)/2);
        }
        return pairs;
    }
}
