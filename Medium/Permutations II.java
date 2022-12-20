/*
Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.

 

Example 1:

Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]
Example 2:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
*/
class Solution {
    public void backtrack(List<List<Integer>> result, List<Integer> temp,
                            int[] nums, boolean[] flag)
    {
        //if temp == nums.length, the it is a permuation &&
        //result should not already contain a copy of it
        if(temp.size()==nums.length && !result.contains(temp))
        {
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0; i<nums.length; i++)
        {
            //flag will keep track of already visited elements
            if(flag[i]==true)
                continue;

            //if not present add it, and flag to true
            flag[i] = true;
            temp.add(nums[i]);

            //backtrack from here
            backtrack(result, temp, nums, flag);

            //remove the recent element and try with new element
            flag[i] = false;
            temp.remove(temp.size()-1);
        }
    }                        
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        //since nums will contain dupliactes, it is good to sort it
        Arrays.sort(nums);

        backtrack(result, new ArrayList<>(), nums, new boolean[nums.length]);

        return result;

        //Time Complexity : o(n* n!)
        //Space Complexity : o(n)
        
    }
}
