/*
Given an array, rotate the array to the right by k steps, where k is non-negative.

 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]

*/

class Solution {
    
    //own reverse logic
    public static void reverse(int[] arr, int start, int end)
    {
        int temp = 0;
        
        while(start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        
        k = k % nums.length;
        
        //reverse only the last k part
        reverse(nums, nums.length-k, nums.length-1);
        
        //reverse the first part, before k
        reverse(nums, 0, nums.length-k-1);
        
        //reverse the whole array
        reverse(nums, 0, nums.length-1);
        
        
        //Time Complexity : o(n)
        //Space Complexity : o(1)
        
    }
}
