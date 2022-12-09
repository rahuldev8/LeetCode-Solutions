/*
Given the root of a binary tree, find the maximum value v for which there exist different nodes a and b where v = |a.val - b.val| and a is an ancestor of b.

A node a is an ancestor of b if either: any child of a is equal to b or any child of a is an ancestor of b.

 

Example 1:


Input: root = [8,3,10,1,6,null,14,null,null,4,7,13]
Output: 7
Explanation: We have various ancestor-node differences, some of which are given below :
|8 - 3| = 5
|3 - 7| = 4
|8 - 1| = 7
|10 - 13| = 3
Among all possible differences, the maximum value of 7 is obtained by |8 - 1| = 7.
Example 2:


Input: root = [1,null,2,null,0,3]
Output: 3

*/

class Solution {
    public int helper(TreeNode root, int currMin, int currMax)
    {
        if(root==null)return currMax-currMin;
        //to calculate min and max till now
        currMin = Math.min(currMin, root.val);
        currMax = Math.max(currMax, root.val);
        
        //processing the left and right nodes to get updated min and max value
        int left = helper(root.left, currMin, currMax);
        int right = helper(root.right, currMin, currMax);

        return Math.max(left, right);
    }
    public int maxAncestorDiff(TreeNode root) {
        int currMin = Integer.MAX_VALUE;
        int currMax = Integer.MIN_VALUE;

        int ans = helper(root, currMin, currMax);
        return ans;

        //Time Complexity : o(n)
        //Space Complexity : o(n)
        
    }
}
