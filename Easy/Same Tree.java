/**
Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

 

Example 1:


Input: p = [1,2,3], q = [1,2,3]
Output: true
Example 2:


Input: p = [1,2], q = [1,null,2]
Output: false
Example 3:


Input: p = [1,2,1], q = [1,1,2]
Output: false
*/

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //if both roots are null
        if(p == null && q == null)return true;
        //if change in structure
        else if(p == null || q == null) return false;
        else if(p.val != q.val) return false;

        boolean Left = isSameTree(p.left, q.left);
        boolean Right = isSameTree(p.right, q.right);

        return Left && Right;
        //Time COmplexity : O(n)
        //Space Complexity : O(1)
    }
}
