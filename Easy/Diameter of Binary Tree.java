/*
Given the root of a binary tree, return the length of the diameter of the tree.

The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

The length of a path between two nodes is represented by the number of edges between them.

 

Example 1:


Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
Example 2:

Input: root = [1,2]
Output: 1
*/
class Solution {

    //Method to Calculate the Height of Tree
    public int height(TreeNode root)
    {
        if(root==null)return 0;

        int l = height(root.left);
        int r = height(root.right);

        return 1+Math.max(l,r);
    }
    //Method to find Height width of tree
    public int diameter(TreeNode root)
    {
        if(root==null)return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        int left = diameter(root.left);
        int right = diameter(root.right);
        //leetcode people excepting diameter as max number of edges
        //therefore here the expresion is lh+rh

        //But in GFG, they are expecting max number of Nodes
        //therefore the expression  will be lh+rh+1
        return Math.max(lh+rh, Math.max(left, right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int ans = diameter(root);
        return ans;
        
        //Time Complexity : o(n)
        //Space Complexity : o(n)
    }
}
