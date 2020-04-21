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
        Set<ListNode> nodes = new HashSet<>();
        ListNode pointerA = headA;
        
        while(pointerA != null)
        {
            nodes.add(pointerA);
            pointerA = pointerA.next;
        }
        
        if(nodes.isEmpty())
        {
            return null;
        }
        
        ListNode pointerB = headB;
        while(pointerB != null)
        {
            if(nodes.contains(pointerB))
            {
                return pointerB;
            }
            
            pointerB = pointerB.next;
        }
        
        return null;
    }
}
