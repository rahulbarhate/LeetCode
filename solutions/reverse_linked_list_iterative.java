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
        ListNode current = head;
        ListNode previous = null;
        
        while(current != null)
        {
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        
        return previous;
    }
}
