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
class Solution
{
    public ListNode swapPairs(ListNode head) 
    {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode previousNode = dummy;
        
        while((head != null) && (head.next != null))
        {
            ListNode firstNode = head;
            ListNode secondNode = head.next;
            
            firstNode.next = secondNode.next;
            previousNode.next = secondNode;
            secondNode.next = firstNode;
            
            previousNode = firstNode;
            head = firstNode.next;
        }
        
        return dummy.next;
    }
}
