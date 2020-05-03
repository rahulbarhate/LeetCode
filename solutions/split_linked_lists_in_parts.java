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
    public ListNode[] splitListToParts(ListNode root, int k)
    {
        ListNode current = root;
        int length = 0;
        while(current != null)
        {
            current = current.next;
            length++;
        }
        
        int width = length/k;
        int remainder = length%k;
        
        ListNode[] result = new ListNode[k];
        current = root;
        for(int i=0; i<k; i++)
        {
            ListNode head = new ListNode(0), write = head;
            for(int j=0; j < width + (i < remainder ? 1 : 0); j++)
            {
                write.next = new ListNode(current.val);
                write = write.next;
                if(current != null)
                {
                    current = current.next;
                }
            }
            
            result[i] = head.next;
        }
        
        return result;
    }
}
