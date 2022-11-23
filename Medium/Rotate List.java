/*
Given the head of a linked list, rotate the list to the right by k places.

 

Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
Example 2:


Input: head = [0,1,2], k = 4
Output: [2,0,1]

*/

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        //Edge Cases
        //1.No Node
        //2.Only one Node
        //3. No Rotations
        
        if(head==null || head.next == null || k == 0)return head;
        
        //counting number of nodes
        ListNode curr = head;
        int nodes = 1;
        while(curr.next!=null)
        {
            nodes++;
            curr = curr.next;
        }
        
        //making the given list cyclic
        curr.next = head;
        
        //Effective Rotations to make
        k = k % nodes;
      //for right rotations, go to kth position
        k = nodes - k;
        
        //travelling to Kth position
        while(k-->0)
        {
            curr = curr.next;
        }
        
        //pointing New head
        head = curr.next;
        //breaking the link between nodes
        curr.next = null;
        
        //returning new head
        
        return head;
        
        //Time Complexity : o(n)
        //Space Complexity : o(1)
    }
}
