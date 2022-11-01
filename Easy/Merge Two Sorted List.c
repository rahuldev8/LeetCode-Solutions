/*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

 

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

*/

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* l1, struct ListNode* l2){
    typedef struct ListNode Node;
    
    Node* th1 = l1;
    Node* th2 = l2;
    
    Node* head,*tail = NULL;
    
    if(th1==NULL)return th2;
    if(th2==NULL)return th1;
    
    if(th1->val < th2->val)
    {
        head = th1;
        tail = th1;
        th1=th1->next;
    }
    else
    {
        head = th2;
        tail = th2;
        th2=th2->next;
    }
    
    while(th1 != NULL && th2 != NULL)
    {
        if(th1->val < th2->val)
        {
            tail->next=th1;
            tail=th1;
            th1=th1->next;
        }
        else
        {
            tail->next=th2;
            tail=th2;
            th2=th2->next;
        }
    }
    
    if(th1 == NULL)tail->next=th2;
    if(th2 == NULL)tail->next=th1;
    
    return head;
    
    //Time Complexity : o(n)
    //Space Compplexity : o(1)

}
