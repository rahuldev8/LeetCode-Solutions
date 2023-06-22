/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Without HashSet
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length-2; i++){
            //just making sure that, no same two elements are forming a triplets
            if(i==0 || (i>0 && nums[i] != nums[i-1])){
                int start = i+1;
                int end = nums.length-1;

                while(start < end){
                    int Zero = nums[i] + nums[start] + nums[end];
                    if(Zero == 0){
                        result.add(Arrays.asList(nums[i], nums[start], nums[end]));

                        //to eliminate duplicate elements
                        while(start<end && nums[start] == nums[start+1]){
                            start++;
                        }
                        while(start<end && nums[end] == nums[end-1]){
                            end--;
                        }

                        //to eliminate TLE, since our method will not return from here...
                        start++;
                        end--;
                    }
                    else if(Zero < 0){
                        start++;
                    }
                    else{
                        end--;
                    }
                }
            }
        }
        return result;
        //Time Complexity : O(n^2) + O(n Log n)
        //Space Complexity : O(1)
        
    }
}
