//25 October 2025

/* Question: Return the middle node of a linked list. 
if there are two middle nodes, return the second middle element.*/

#include<stdio.h>

 struct ListNode {
      int val;
      struct ListNode *next;
 };
 
struct ListNode* middleNode(struct ListNode* head) {

    // finding last node to find length of list
    int count = 0;
    struct ListNode* temp;
    temp = head;
    while(temp != NULL){
        temp = temp -> next;
        count++;
    }
    
    //calculating mid
    int mid = 0;
    if (count % 2 == 0){
        mid = (count / 2 );
    }
    else{
        mid = (count - 1 ) / 2;
    }

    //traversing to mid and returning. 
    while(mid > 0 ){
        head = head ->next;
        mid--;
    }
    return head;
}