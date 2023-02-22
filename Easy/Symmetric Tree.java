/*
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

 

Example 1:


Input: root = [1,2,2,3,4,4,3]
Output: true
Example 2:


Input: root = [1,2,2,null,3,null,3]
Output: false
*/

class Solution {
    public boolean isSimilar(TreeNode tree1, TreeNode tree2)
    {
        if(tree1==null && tree2==null)return true;
        else if(tree1==null || tree2==null)return false;
        else if(tree1.val != tree2.val) return false;

        //since it is symmetric tree, its left and right should be same
        return isSimilar(tree1.left, tree2.right) && isSimilar(tree1.right, tree2.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return isSimilar(root.left, root.right);
    }
}
