/*
Given the head of a singly linked list, reverse the list, and return the reversed list.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
*/

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head){
    typedef struct ListNode Node;
    
    Node* prev = NULL;
    Node* curr = head;
    Node* next = NULL;
    
    while(curr!=NULL)
    {
        next = curr->next;
        curr->next=prev;
        
        prev = curr;
        curr = next;
    }
    return prev;
    
    //Time Complexity : o(n)
    //Space Complexity : o(1)
}
