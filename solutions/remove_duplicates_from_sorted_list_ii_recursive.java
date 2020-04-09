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
        
        if(head.val != head.next.val)
        {
            head.next = deleteDuplicates(head.next);
            return head;
        }
        
        else
        {
            while(head.next != null && head.val == head.next.val)
            {
                head = head.next;
            }
            
            return deleteDuplicates(head.next);
        }
            
        
    }
}
