/*
Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

You must solve it in O(n) time complexity.

 

Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
*/

class Solution {
    public int findKthLargest(int[] nums, int k) {
        //Using Min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //insert first k elements to min heap
        for(int i=0; i<k; i++)
            pq.add(nums[i]);

        //check balance elements, if they are larger than peek of heap,
        //poll the root of heap and insert the current element
        for(int i=k; i<nums.length; i++)
        {
            if(nums[i]>pq.peek())
            {
                pq.poll();
                pq.add(nums[i]);
            }
        } 
        return pq.peek(); 
        //Time Complexity : o(n log n) -> log n for opeation on heap, for n
        //Space Complexity : o(n)
        
    }
}
