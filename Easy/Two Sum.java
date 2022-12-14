/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.*/


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for (int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}

//Efficient Approach

class Solution {
    public int[] twoSum(int[] nums, int target) {
        //HashMap Technique
        Map<Integer, Integer> map  = new HashMap<>();

        for(int i=0; i<nums.length; i++)
        {
            int comp = target - nums[i];

            //checking the number which adds up to comp to get target
            if(map.containsKey(comp))
            //get will return the value of key, in this case it will store index
                return new int[]{map.get(comp), i};
            //else put the number in map with it's index
            else    
            map.put(nums[i], i);
        }
        //If no match found
        return new int[]{-1, -1};

        //Time Complexity : o(n)
        //Space Compleity : o(n)
        
    }
}
