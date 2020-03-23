/**
 * Definition for singly-linked list.
 * public class ListNode
 {
 *     int val;
 *     ListNode next;
 *     ListNode(int x)
       { 
        val = x;
       }
 * }
 */
class Solution
{
    private ListNode frontPointer;
    
    private boolean recursivelyCheck(ListNode currentNode)
    {
        if(currentNode!=null)
        {
            if(!recursivelyCheck(currentNode.next))
                return false;
            if(currentNode.val != frontPointer.val)
                return false;
            
            frontPointer = frontPointer.next;
        }
        return true;
    }
    
    public boolean isPalindrome(ListNode head)
    {
        frontPointer = head;
        return recursivelyCheck(frontPointer);
    }
}
