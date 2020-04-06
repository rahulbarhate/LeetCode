/**
 * Definition for singly-linked list.
 * public class ListNode 
 {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution
{
    public ListNode removeElements(ListNode head, int val) 
    {
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        
        ListNode previous = sentinel, current = head;
        while(current != null)
        {
            if(current.val == val)
            {
                previous.next = current.next;
            }
            else
            {
                previous = current;
            }
            current = current.next;
        }
        
        return sentinel.next;
    }
}
