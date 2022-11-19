/*
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.

 

Example 1:

Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6
Example 2:

Input: lists = []
Output: []
Example 3:

Input: lists = [[]]
Output: []

*/

class Solution {
    public ListNode mergetwo(ListNode a, ListNode b)
    {
        if(a==null) return b;
        if(b==null) return a;
        ListNode head = null, tail = null;
        
        if(a.val<b.val)
        {
            head = a;
            tail = a;
            a = a.next;
        }
        else
        {
            head = b;
            tail = b;
            b = b.next;
        }
        
        while(a!=null && b!=null)
        {
            if(a.val<b.val)
            {
                tail.next = a;
                tail = a;
                a = a.next;
            }
            else
            {
                tail.next = b;
                tail = b;
                b = b.next;
            }
        }
        if(a==null)tail.next=b;
        if(b==null)tail.next=a;
        
        return head;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        
        ListNode ans = null;
        
        //Taking pair of sorted linked list and merging them, Storing their start point(head)
        //in ans reference variable
        for(ListNode i : lists)
        {
            ans = mergetwo(i,ans);
        }
        
        return ans;
        
    }
    //Time Complexity : o(n^2)
    //Space Complexity : o(1)
}
