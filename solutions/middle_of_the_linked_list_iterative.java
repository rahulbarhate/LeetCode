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
        int length = 1;
        
        ListNode current = head;
        while(current.next != null)
        {
            current = current.next;
            length++;
        }
        
        int middle = length/2;
        current = head;
        int i=0;
        
        while(i<middle)
        {
            current = current.next;
            i++;
        }
        
        return current;
    }
}
