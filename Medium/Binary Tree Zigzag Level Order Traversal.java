/*
Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]
Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: []
*/

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> level = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        if(root==null) return level;

        que.add(root);
        //true means, left to right
        Boolean dir = true;
        while(!que.isEmpty())
        {
            List<Integer> temp = new ArrayList<>();
            //count must be QUEUE's size'
            int count = que.size();

            while(count != 0)
            {
                TreeNode curr = que.poll();
                temp.add(curr.val);
                if(curr.left != null) que.add(curr.left);
                if(curr.right != null) que.add(curr.right);
                count--;
            }
            //using flag, to decide zigzag of traversal
            if(dir==true)
            {
                level.add(temp);
                dir=false;
            }
            else if(dir==false)
            {
                Collections.reverse(temp);
                level.add(temp);
                dir=true;
            }
        }

        return level;
        //Time Complexity : O(n)
        //Space Complexity : O(n)
        
    }
}
