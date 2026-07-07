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
    public ListNode reverse(ListNode head, int k){
        int count = 0;
        ListNode temp = head;
        while(count<k){
            if(temp == null){
                return head;
            }
            temp = temp.next;
            count++;
        }
        ListNode prev = reverse(temp,k);
        count = 0;
        temp = head;
        ListNode next = null;
        while(count<k){
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
            count++;
        }
        return prev;

    }
    public ListNode swapPairs(ListNode head) {
      if(head == null){
        return null;
      }
      if(head.next == null){
        return head;
      }
      int k = 2;
      ListNode ans = reverse(head,k);
      return ans;
    }
}