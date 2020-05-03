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
            ListNode head = current;
            for(int j=0; j < width + (i < remainder ? 1 : 0) - 1; j++)
            {
                if(current != null)
                {
                    current = current.next;
                }
            }
                
                if(current != null)
                {
                    ListNode previous = current;
                    current = current.next;
                    previous.next = null;
                }
                
                result[i] = head;
        }
        
        return result; 
    }
}
