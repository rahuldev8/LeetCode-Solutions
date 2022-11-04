/*
Given the root of a binary tree, return the sum of values of its deepest leaves.
 

Example 1:


Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
Output: 15

*/

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int deepestLeavesSum(TreeNode* root) {
        if(root==NULL) return 0;
        
        vector<vector<int>>ans;
        queue<TreeNode*>q;
        q.push(root);
        
        while(!q.empty())
        {
            vector<int>v;
            int count = q.size();
            
            while(count != 0)
            {
                TreeNode* t = q.front();
                q.pop();
                v.push_back(t->val);
                if(t->left!=NULL)q.push(t->left);
                if(t->right!=NULL)q.push(t->right);
                count--;
            }
            ans.push_back(v);
        }
        //Asusual we are using BFS(level order) and taking last level's stored vector ans summing its value and returing it
        int sum =0;
        for(auto i:ans[ans.size()-1])
            sum+=i;
        return sum;
        
        //Time Complexity : o(n)
        //Space Complexity : o(n)
    }
};
