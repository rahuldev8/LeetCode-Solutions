public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode fakeHead = new ListNode(-1);
        reverse(head, fakeHead);
        return fakeHead.next;
    }
    //reverse returns the tail of the reversed list
    private ListNode reverse(ListNode node, ListNode fakeHead){
        if (node == null)
            return fakeHead;
        else{
            ListNode tail = reverse(node.next, fakeHead);
            tail.next = node;
            node.next = null;
            return node;
        }
    }
}
