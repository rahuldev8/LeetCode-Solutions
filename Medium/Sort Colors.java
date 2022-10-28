/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

*/

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;//length of given array
        int zc=0,oc=0; //initially zero count and one count is 0
        for(int i=0;i<n;i++)
        {
            if(nums[i] == 0)zc++; //take count of zeros
            if(nums[i] == 1)oc++;//take count of ones
        }
        for(int i=0;i<zc;i++)//from 0 to zc value populate with 0
            nums[i] = 0;
        for(int i=zc;i<zc+oc;i++)//from zc to zc+oc value populate with 1
            nums[i] = 1;
        for(int i=zc+oc;i<n;i++)//from zc+oc to n value populate with 2
            nums[i] = 2;
        
        //Achieved Time Complexity : o (n)
        //Space Complexity : o(1)
    }
}
