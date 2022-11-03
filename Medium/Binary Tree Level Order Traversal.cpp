/*
Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]

*/

class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* root) {
        vector<vector<int>> ans;//return is vector of vector int
        if(root==NULL)return ans;
        
        queue<TreeNode*>q;
        q.push(root);
        
        while(!q.empty())
        {
            vector<int>v;//if queue is not empty create another vector
            int count = q.size();
            
            while(count != 0)
            {
                TreeNode* temp = q.front();
                q.pop();
                v.push_back(temp->val);//push each levels nodes to local vector v
                if(temp->left != NULL)q.push(temp->left);
                if(temp->right != NULL)q.push(temp->right);
                count--;
            }
            ans.push_back(v);//pushing every (v) vector to ans vector
        }
        return ans;
    }
    
    //Time Complexity : o(n) even it is nested loop we are visting every node only once
    //Space Complexity : o(n) queue size
};
