/*
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the 
frequency
 of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

 

Example 1:

Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
*/
class Solution {
    public void helper(int[] arr, int index, int sum, int target, List<Integer> temp,
                        List<List<Integer>> result){
    if(index == arr.length || sum > target){
        if(sum == target){
            result.add(new ArrayList<>(temp));
            // System.out.println(temp+" curr sum: "+sum);
        }
        return;
    }
    temp.add(arr[index]);
    helper(arr, index, sum+=arr[index], target, temp, result);
    temp.remove(temp.size()-1);
    helper(arr, index+1, sum-=arr[index], target, temp, result);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<>();
        helper(candidates, 0, 0, target, temp, result);
        // Collections.sort(result);
        return result;
    }
}
