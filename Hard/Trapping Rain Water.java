/*
Given n non-negative integers representing an elevation map where 
the width of each bar is 1, compute how much water it can trap after raining.

Example 1:

Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is 
represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
*/

//Achieved Time Complexity : o(n)
//Achieved Space Complexity : o(n)

class Solution {
    public int trap(int[] a) {
        int n = a.length;//length of given array
        int water =0;//total units of water, initially 0
        int lm[] = new int[n];//lm array to find left maximum values of same as array A size
        int rm[] = new int[n];//rm array to find right maximum values of same as array A size
        
        lm[0] = a[0];//to populate max array, we need atleast one element to compare it with current index value, so we taking first element from given array and stroing in 0th index at lm array
        for(int i=1;i<n;i++)
        {
            lm[i] = Math.max(a[i],lm[i-1]);//populating lm array, by comaring previous element in lm array
        }
        
        rm[n-1] = a[n-1];//to populate max array, we need atleast one element to compare it with current index value, so we taking last element from given array and storing it in last position of rm array
        for(int i=n-2;i>=0;i--)
        {
            rm[i] = Math.max(a[i],rm[i+1]);//populating rm array, by comparing it with current value at original array and previous element in rm array
        }
        
        
        for(int i=0;i<n;i++)//iterating through all array elements
        {
            water += Math.min(lm[i],rm[i])-a[i]; //min of lm and rm, subracting it with current height
        }
        
        return water;
    }
}
