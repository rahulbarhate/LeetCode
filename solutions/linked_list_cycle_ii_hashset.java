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
    public ListNode detectCycle(ListNode head)
    {
        HashSet<ListNode> seen = new HashSet<ListNode>();
        ListNode node = head;
        while(node != null)
        {
            if(seen.contains(node))
                return node;
            
            seen.add(node);
            node = node.next;
        }
        
        return null;
    }
}
