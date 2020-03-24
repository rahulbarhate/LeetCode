/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution
{
    private ListNode getIntersection(ListNode head)
    {
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
                return slow;
        }
        
        return null;
    }
    
    
    public ListNode detectCycle(ListNode head)
    {
        if(head == null)
            return null;
        
        ListNode intersect = getIntersection(head);
        if(intersect == null)
            return null;
        
        ListNode ptr1 = head;
        ListNode ptr2 = intersect;
        
        while(ptr1 != ptr2)
        {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        
        return ptr1;
        
    }
}
