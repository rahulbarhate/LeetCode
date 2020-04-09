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
        if(head == null || head.next == null)
            return head;
        
        head.next = deleteDuplicates(head.next);
        
        if(head.next != null && head.next.val == head.val)
        {
            return head.next;
        }
        
        return head;
    }
}
