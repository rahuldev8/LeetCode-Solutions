/*
Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.

 

Example 1:


Input: root = [3,1,4,null,2], k = 1
Output: 1
Example 2:


Input: root = [5,3,6,2,4,null,null,1], k = 3
Output: 3

*/

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        //Morris Inorder traversal
        int count = 0;

        TreeNode curr = root;
        while(curr != null)
        {
            //case 1: if left subtree is not present
            if(curr.left==null)
            {
                //Processing root
                count++;
                if(count==k)return curr.val;
                curr = curr.right;
            }
            else
            {
                TreeNode thread = curr.left;
                //going to left subtree's right most element
                while(thread.right != null && thread.right != curr)
                    thread = thread.right;

                //case 2 : if there no thread
                if(thread.right==null)
                {
                    thread.right = curr;
                    curr = curr.left;
                }
                //case 3 : if thread is present already
                else
                {
                    thread.right = null;
                    //Processing root
                    count++;
                    if(count==k)return curr.val;
                    curr = curr.right;
                }    
            }
        }
        return -1;
        //Time Complexity : o(n)
        //Space Complexity : o(1)
    }
}
