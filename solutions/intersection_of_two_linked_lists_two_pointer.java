/**
 * Definition for singly-linked list.
 * public class ListNode {
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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB)
    {
        ListNode pointerA = headA, pointerB = headB;
        while(pointerA != pointerB)
        {
            pointerA = (pointerA != null) ? pointerA.next : headB;
            pointerB = (pointerB != null) ? pointerB.next : headA;
        }
        
        return pointerB;
    }
}
