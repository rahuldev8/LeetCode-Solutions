/*
Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

 

Example 1:


Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
Example 2:

Input: head = [], val = 1
Output: []
Example 3:

Input: head = [7,7,7,7], val = 7
Output: []
*/

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        //Creating DummyNode because, maybe head.val==val
        ListNode dummyhead = new ListNode(-1);
        //hew head is dummy and joining head to its next
        dummyhead.next = head;

        //curr to traverse the list
        ListNode curr = dummyhead;

        while(curr.next!=null)
        {
            //if value matches, skip the node
            if(curr.next.val==val)
                curr.next = curr.next.next;
            //else look for next node   
            else
                curr = curr.next;
        } 
        //dummy's next will be head, if given is deleted
        return dummyhead.next;
        //Time Complexity : o(n)
        //Space Complexity : o(1)
    }
}
