/*
Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.
Example 1:
Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        //to handle edge case if left ==1(given is one based indexing)
        ListNode dummy = new ListNode();
        //just bringing front the last node to first position
        dummy.next = head;
        ListNode prev = dummy;

        //placing prev just before left
        for(int i=0; i<left-1; i++){
            prev = prev.next;
        }

        //current will be prev's next
        ListNode curr = prev.next;

        for(int i=0; i<right-left; i++){
            ListNode forw = curr.next;

            //just interchanging the nodes
            curr.next = forw.next;
            forw.next = prev.next;
            prev.next = forw;
        }

        return dummy.next;

        //Time Complexity : O(n) 
        //SPace Complexity : O(1)
    }
}
