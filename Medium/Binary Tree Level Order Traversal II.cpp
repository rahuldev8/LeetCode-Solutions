/*
Given the root of a binary tree, return the bottom-up level order traversal of its nodes' values. (i.e., from left to right, level by level from leaf to root).

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[15,7],[9,20],[3]]

*/

class Solution {
public:
    vector<vector<int>> levelOrderBottom(TreeNode* root) {
        vector<vector<int>> ans;
        if(root==NULL)return ans;
        
        queue<TreeNode*> q;
        q.push(root);
        
        while(!q.empty())//taversing every node in given tree
        {
            vector<int>v;
            int count = q.size();
            
            while(count != 0)
            {
                TreeNode* temp = q.front();
                q.pop();
                v.push_back(temp->val);//pushing value to v vector
                if(temp->left != NULL) q.push(temp->left);
                if(temp->right != NULL) q.push(temp->right);
                --count;
            }
            ans.push_back(v);//pushing v vector to ans vector
        }
        //reversing to achieve the requirements of problem :)
        reverse(ans.begin(), ans.end());
        return ans;   
        
        //Time Complexity : o(n) even though it is nested loop we are visiting every node only once
        //Space Complexity : o(n) size of queue and vectors
    }
};
