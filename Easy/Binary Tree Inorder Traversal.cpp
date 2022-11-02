/*
Given the root of a binary tree, return the inorder traversal of its nodes' values.
 

Example 1:


Input: root = [1,null,2,3]
Output: [1,3,2]
*/


class Solution {
public:
    //Recursive Approach
    void inorder(TreeNode* root, vector<int>&v)
    {
        if(root==NULL)return ;
        
        inorder(root->left, v);//reach to last possible left node
        v.push_back(root->val);//Processing root and pushing to v which is alias to vector v
        inorder(root->right, v);//reach to last possible right node
    }
    
    vector<int> inorderTraversal(TreeNode* root) {
        vector<int> v;
        
        inorder(root, v);
        
        return v;
        
        //Time Complexity : o(n)
        //Space Complexity : o(n)
        
    }
};
