/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
*/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        //Efficient Approach using Binary Search
        //   l1<r2
        //   l2<r1
        //Perfrom Binary search always on smaller array
        if(nums1.length > nums2.length) return findMedianSortedArrays(nums2, nums1);

        int n1 = nums1.length;
        int n2 = nums2.length;

        int start=0;
        int end = n1;

        while(start<=end)
        {
            //Calcuate Cuts
            int cut1 = start+(end-start)/2;
            int cut2 = (n1+n2+1)/2 - cut1;

            //Calculate l1, l2, r1 and r2 points
            int l1 = cut1==0?Integer.MIN_VALUE:nums1[cut1-1];
            int l2 = cut2==0?Integer.MIN_VALUE:nums2[cut2-1];

            int r1 = cut1==n1?Integer.MAX_VALUE:nums1[cut1];
            int r2 = cut2==n2?Integer.MAX_VALUE:nums2[cut2];

            //Checking for below conditions
        //   l1<r2
        //   l2<r1

        //found four perfect points, which meets our condition
            if(l1<=r2 && l2<=r1)
            {
                //if merged array is in even length
                if((n1+n2)%2==0)
                    return (Math.max(l1,l2) + Math.min(r1,r2))/2.0;
                else
                    return Math.max(l1,l2);    
            } 
            else if(l1>r2)
                end = cut1-1;
            else 
                start = cut1+1;    
        }
        return 0.0;
        //Time Complexity : O(log(min(n1,n2)))
        //Space Complexity : O(1)
    }
}
