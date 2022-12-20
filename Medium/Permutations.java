/*
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:

Input: nums = [1]
Output: [[1]]
*/
class Solution {
    public void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums)
    {
        //if temp size is equal then it is a permuation
        if(temp.size()==nums.length)
        {
            result.add(new ArrayList<>(temp));
            return;
        }

        //iterating through the array
        for(int i : nums)
        {
            //permutions should not contain any duplicates
            if(temp.contains(i))
                continue;

            //add that element to temp list
            temp.add(i);
            //go back to previous level
            backtrack(result, temp, nums);
            //delete the last added element and try with new one
            temp.remove(temp.size()-1);    
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        //BackTracking

        //List of list to return
        List<List<Integer>> result = new ArrayList<>();

        //calling helper method named backtrack
        backtrack(result, new ArrayList<>(), nums);

        return result;

        //Time Complexity : o(n * n!)
        //Space Complexity : o(n)
        
    }
}
