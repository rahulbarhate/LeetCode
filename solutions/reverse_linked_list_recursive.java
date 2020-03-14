/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) 
    {
       if(head == null || head.next == null)
           return head;
        
        ListNode p  = reverseList(head.next);
        head.next.next = head; // ListNode q = p.next; q.next = p; is the same as p.next.next = p;
        head.next = null;
        return p;
    }
}
