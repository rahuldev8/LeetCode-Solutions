/*
Given the root of a binary tree, return the average value of the nodes on each level in the form of an array. Answers within 10-5 of the actual answer will be accepted.
 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [3.00000,14.50000,11.00000]
Explanation: The average value of nodes on level 0 is 3, on level 1 is 14.5, and on level 2 is 11.
Hence return [3, 14.5, 11].
Example 2:


Input: root = [3,9,20,15,7]
Output: [3.00000,14.50000,11.00000]
*/

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty())
        {
            List<Integer> temp = new ArrayList<>();
            int count = que.size();

            //simple sum/nodes math in level order traversal of binary tree
            double sum = 0;
            double nodes = 0;

            while(count != 0)
            {
                TreeNode curr = que.poll();
                sum += curr.val;
                nodes++;
                if(curr.left != null) que.add(curr.left);
                if(curr.right != null) que.add(curr.right);
                count--;
            }
            result.add(sum/nodes);
        }
        return result;
        //Time Complexity : O(n)
        //Space Complexity : O(n)
    }
}
