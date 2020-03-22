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
    public ListNode middleNode(ListNode head)
    {
        if(head.next == null)
            return head;
        
        if(head.next.next == null)
            return head.next;
        
        ListNode[] A = new ListNode[100];
        int t = 0;
        while(head.next != null)
        {
            A[t++] = head;
            head = head.next;
        }
        
        int middle = (t%2 == 0) ? (t/2) : (t/2 + 1);
        return A[middle];
    }
}
