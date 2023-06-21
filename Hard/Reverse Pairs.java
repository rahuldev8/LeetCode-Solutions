/*
Given an integer array nums, return the number of reverse pairs in the array.

A reverse pair is a pair (i, j) where:

0 <= i < j < nums.length and
nums[i] > 2 * nums[j].
 

Example 1:

Input: nums = [1,3,2,3,1]
Output: 2
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1
*/
class Solution {
    public int mergeSort(int[] nums, int start, int mid, int end){
        int i=start, j = mid+1, k = 0;
        int[] buffer = new int[end-start+1];

        //logic for counting pairs
        int right = mid+1;
        int pairs = 0;
        for(int left = start; left<=mid; left++){
            while(right <= end && nums[left] > (long)nums[right]*2)
                right++;

            //counting left side elements of right array
            pairs += right-(mid+1);    
        }
        //end of counting pairs logic
        while(i<=mid && j<=end){
            if(nums[i] < nums[j]){
                buffer[k++] = nums[i++];
            }else{
                buffer[k++] = nums[j++];
            }
        }

        while(i<=mid){
            buffer[k++] = nums[i++];
        }

        while(j<=end){
            buffer[k++] = nums[j++];
        }

        //copying back to original array
        for(int x=0; x<buffer.length; x++){
            nums[x+start] = buffer[x];
        }

        return pairs;
    }
    public int merge(int[] nums, int start, int end){
        //base condition
        if(start>=end)
            return 0;

        int mid = start+(end-start)/2;

        int left = merge(nums, start, mid);
        int right = merge(nums, mid+1, end);

        int pairs = mergeSort(nums, start, mid, end);

        return left+right+pairs;    
    }
    public int reversePairs(int[] nums) {
        return merge(nums, 0 , nums.length-1);
    }

    //Time Complexity : O(N log N) --> Modified Merge Sort
    //Space Complexity : O(N)  --> Recursive stack space
}
