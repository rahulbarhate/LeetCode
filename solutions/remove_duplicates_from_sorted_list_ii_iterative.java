/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution
{
    public ListNode deleteDuplicates(ListNode head)
    {
        ListNode dummy = new ListNode(0);
        
        dummy.next = head;
        ListNode previous = dummy;
        ListNode current = head;
        
        while(current != null)
        {
            while(current.next != null && previous.next.val == current.next.val)
            {
                current = current.next;
            }
            
            if(previous.next == current)
                previous = previous.next;
            
            else
            {
                previous.next = current.next;
            }
            
            current = current.next;
        }
        
        head = dummy.next;
        return head;
    }
}
