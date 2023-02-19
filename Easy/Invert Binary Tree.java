class Solution {
    public void helper(TreeNode root)
    {
        if(root==null) return;

        helper(root.left);
        helper(root.right);
        //if(root.left != null && root.right != null)
        {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
        
    }
    public TreeNode invertTree(TreeNode root) {
        helper(root);
        return root;

        //Time Complexity : O(n)
        //Space Complexity : O(n)
    }
}
