/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{
    public int numComponents(ListNode head, int[] G) 
    {
        Set<Integer> setG = new HashSet<>();
        for (int i: G)
        {
            setG.add(i);
        }
        
        int result = 0;
        
        while (head != null) 
        {
            if (setG.contains(head.val) && (head.next == null || !setG.contains(head.next.val)))
                result++;
            
            head = head.next;
        }
        return result;
    }
}
