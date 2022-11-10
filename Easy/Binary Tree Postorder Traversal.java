/*
Given the root of a binary tree, return the postorder traversal of its nodes' values.

 

Example 1:


Input: root = [1,null,2,3]
Output: [3,2,1]
Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]

*/

class Solution {
public:
    void postorder(TreeNode* root, vector<int>&v)
    {
        if(root==NULL)return;
        
        if(root->left!=NULL)postorder(root->left, v);
        if(root->right!=NULL)postorder(root->right, v);
        
        v.push_back(root->val);
    }
    vector<int> postorderTraversal(TreeNode* root) {
        vector<int>v;
        
        postorder(root, v);
        return v;
        
        //Time Complexity : o(n)
        //Space Complexity : o(n)
        
    }
};

