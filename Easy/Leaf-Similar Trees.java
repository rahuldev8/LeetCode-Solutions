/*
Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a leaf value sequence.



For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).

Two binary trees are considered leaf-similar if their leaf value sequence is the same.

Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.

 

Example 1:


Input: root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
Output: true
Example 2:


Input: root1 = [1,2,3], root2 = [1,3,2]
Output: false

*/

class Solution {
    //helper function to add leaf nodes, by Inorder
    public void helper(TreeNode root, ArrayList<Integer> tree)
    {
        if(root==null)return;

        helper(root.left, tree);
        if(root.left==null && root.right==null)tree.add(root.val);
        helper(root.right, tree);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> tree1 = new ArrayList<>();
        ArrayList<Integer> tree2 = new ArrayList<>();

        helper(root1, tree1);
        helper(root2, tree2);

        //Equals function return true if both list are same
        return tree1.equals(tree2);
    }
    //Time Complexity : o(n+m) size of tree1 + tree2
    //Space Complexity : o(n+m)
}
