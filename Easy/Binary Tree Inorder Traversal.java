/*
Given the root of a binary tree, return the inorder traversal of its nodes' values.
 

Example 1:


Input: root = [1,null,2,3]
Output: [1,3,2]
*/


class Solution {
    public static void traverse(TreeNode root, List<Integer>list)
    {
        if(root==null)return;
        
        if(root.left!=null)traverse(root.left, list);
        list.add(root.val);
        if(root.right!=null)traverse(root.right, list);
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        traverse(root, list);
        return list;
    }
}
//Time Complexity : o(n)
//Space COmplexity : o(n)
