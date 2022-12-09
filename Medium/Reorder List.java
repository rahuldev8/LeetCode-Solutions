/*
You are given the head of a singly linked-list. The list can be represented as:

L0 → L1 → … → Ln - 1 → Ln
Reorder the list to be on the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
You may not modify the values in the list's nodes. Only nodes themselves may be changed.

 

Example 1:


Input: head = [1,2,3,4]
Output: [1,4,2,3]
Example 2:


Input: head = [1,2,3,4,5]
Output: [1,5,2,4,3]

*/

class Solution {
    public ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }
    public void reorderList(ListNode head) {
        //Step 1: Find middle of the list
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null)
        {
            fast = fast.next;
            if(fast!=null)
            {
                fast = fast.next;
                slow = slow.next;
            }
        }
        ListNode first = head;
        //Step 2: reverse the Second list
        ListNode second = reverse(slow.next);
        slow.next = null;

        while(second!=null)
        {
            //Temp variables to store the remaining list
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            //binding the lists
            first.next = second;
            second.next = temp1;

            //moving to next elements
            first = temp1;
            second = temp2;
        }

        //Time Complexity : o(n)
        //Space Complexity : o(1)

        
    }
}
