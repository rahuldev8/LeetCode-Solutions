/*
Given the root node of a binary search tree and two integers low and high, return the sum of values of all nodes with a value in the inclusive range [low, high].

 

Example 1:


Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
Output: 32
Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.
Example 2:


Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
Output: 23
Explanation: Nodes 6, 7, and 10 are in the range [6, 10]. 6 + 7 + 10 = 23.

*/

class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null) return 0;

        //if node val is in given range return that and visst next nodes
        if(root.val>=low && root.val<=high)
            return root.val+rangeSumBST(root.left, low, high)+
                            +rangeSumBST(root.right, low, high);
        //in BST, if node is less than target, all left will be smaller                    
        else if(root.val<low)
            return rangeSumBST(root.right, low, high);
            //in BST, if node is high than target, all right nodes will be larger    
        else
            return rangeSumBST(root.left, low, high); 

            //Time Complexity : o(n)
            //Space Complexity : o(n)    
    }
}
