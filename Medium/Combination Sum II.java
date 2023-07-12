/*
Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

Each number in candidates may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.

 

Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]
*/
class Solution {
    public void helper(int[] arr, int index, int target, List<Integer> temp, List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(temp));
            return;
        }
        //trying out all combinations (pattern - II)
        for(int i=index; i<arr.length; i++){
            if(arr[i] > target)
                break;
            //don't check previous index than current's and if there are similar elements then skip    
            if(i > index && arr[i] == arr[i-1])
                continue;

            //if above checks are passed, pick current element
            temp.add(arr[i]);
            helper(arr, i+1, target-arr[i], temp, result);
            temp.remove(temp.size() - 1);        
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();    
        helper(candidates, 0, target, new ArrayList<>(), result);
        return result;    
    }
}
//Time Complexity : O(2 ^ n)  -> recursion calls
    //                  O(K)  -> for inserting temp to result list
    //                  O(n log n)  -> for Sorting
    //Space Complexity : O(n)  -> recursion stack space
    //                  O(k) -> for result list
