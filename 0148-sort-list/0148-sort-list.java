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

    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }
    public ListNode mergeSort(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        // Find mid 
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;
        ListNode head1 =mergeSort(head);
        ListNode head2 =mergeSort(slow);
        ListNode ans = merge(head1,head2);
        return ans ;

    }

    public ListNode merge(ListNode head1 , ListNode head2){
        ListNode ansHead = new ListNode(-1); // dump Linkedlist
        ListNode temp = ansHead;
        //merge both Linkedlist

        while(head1 != null && head2 != null){
            if(head1.val <= head2.val){
                temp.next = head1;
                head1 = head1.next;
              
            }else{
                temp.next = head2;
                head2 = head2.next;
                
            }
            temp = temp.next;
        }
        while(head1 != null){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;   
        }
         
         while(head2 != null){
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;   
        }
       
        // remove the dumy node 

        // ListNode t1 = ansHead;
        // ansHead = ansHead.next;
        // t1.next = null;
        
        return ansHead.next ;

    }
}