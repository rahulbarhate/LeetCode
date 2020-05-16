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
    private boolean stop;
    private ListNode left;
    
    public void recurseAndReverse(ListNode right, int m, int n)
    {
        if(n==1)
        {
            return;
        }
        
        right = right.next;
        
        if(m>1)
        {
            this.left = this.left.next;
        }
        
        this.recurseAndReverse(right, m-1, n-1);
        
        if(this.left == right || right.next == this.left)
        {
            this.stop = true;
        }
        
        if(!this.stop)
        {
            int temp = this.left.val;
            this.left.val = right.val;
            right.val = temp;
            
            this.left = this.left.next;
        }
    }
    
    public ListNode reverseBetween(ListNode head, int m, int n)
    {
        this.left = head;
        this.stop = false;
        this.recurseAndReverse(head, m, n);
        return head;
    }
}
