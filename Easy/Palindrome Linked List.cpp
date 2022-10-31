/*
Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

 

Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false

*/

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    bool isPalindrome(ListNode* head) {
        typedef ListNode Node;
        stack<int> s;
        Node* th = head;
        
        while(th!=NULL)
        {
            s.push(th->val);
            th=th->next;
        }
        th = head;
        
        while(th!=NULL)
        {
            if(th->val != s.top()) return false;
            else
            {
                s.pop();
                th=th->next;
            }
            
        }
        return true;
        
        //Time Complexity : o(n)
        //Space Complexity : o(n)
        
    }
};
