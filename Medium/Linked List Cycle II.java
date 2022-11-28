/*
Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.

Do not modify the linked list.

 

Example 1:


Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.
Example 2:


Input: head = [1,2], pos = 0
Output: tail connects to node index 0
Explanation: There is a cycle in the linked list, where tail connects to the first node.
Example 3:


Input: head = [1], pos = -1
Output: no cycle
Explanation: There is no cycle in the linked list.

*/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        //Slow fast Pointer approach
        ListNode slow = head;
        ListNode fast = head;
        
        //move fast and slow pointers, 2 and 1 steps respectively
        while(fast!=null)
        {
            fast = fast.next;
            if(fast!=null)
            {
                fast = fast.next;
                slow = slow.next;
            }
            //if they met, loop detected, the assign head to slow (slow = head)
            if(fast==slow)
            {
                slow = head;
                
                //Start moving two pointers one at each step
                while(slow!=fast)
                {
                    slow = slow.next;
                    fast = fast.next;
                }
                //if they met at a point then it is a starting of loop, return it
                return slow;
            }
        }
        //if no loop detected return null
        return null;
        
    }
    //Time Complexity : o(n)
    //Space Complexity : o(1)
}
