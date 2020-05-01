/** Convert Binary Number in a Linked List to Integer
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
    public int getDecimalValue(ListNode head)
    {
        int decimalValue = 0;
        while(head != null)
        {
            decimalValue = (decimalValue<<1) + (head.val);
            head = head.next;
        }
        
        return decimalValue;
    }
}
