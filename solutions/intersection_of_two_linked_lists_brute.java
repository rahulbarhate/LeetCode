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
        ListNode pointerA = headA, pointerB;
        while(pointerA != null)
        {
            for(pointerB = headB; pointerB != null; pointerB = pointerB.next)
            {
                if(pointerA == pointerB)
                {
                    return pointerA;
                }
            }
            
            pointerA = pointerA.next;
        }
        
        return null;
    }
}
