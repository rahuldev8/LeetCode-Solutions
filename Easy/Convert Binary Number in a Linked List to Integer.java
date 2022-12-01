/*
Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

The most significant bit is at the head of the linked list.

 

Example 1:


Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10
Example 2:

Input: head = [0]
Output: 0

*/

class Solution {
    public int getDecimalValue(ListNode head) {
        int ans = 0;
        
        while(head != null)
        {
            //Since we are converting Binary to decimal, multiplying the previous
            // value with 2, AS LIKE AS DECIMAL(x By 10)
            ans *= 2;
            //Adding current val to ans
            ans += head.val;
            head = head.next;
        }
        
        return ans;
        
        //Time Complexity : o(n)
        //Space Complexity : o(1)
    }
}
