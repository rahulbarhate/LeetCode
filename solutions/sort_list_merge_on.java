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
    public ListNode sortList(ListNode head)
    {
        return mergeSort(head);
    }

    ListNode mergeSort(ListNode head) 
    { 
      
        if (head == null || head.next == null)
        { 
            return head; 
        } 
  
        ListNode middle = getMiddle(head); 
        ListNode nextToMiddle = middle.next; 
 
        middle.next = null; 
  
        ListNode left = mergeSort(head); 
        ListNode right = mergeSort(nextToMiddle); 
  
        ListNode sortedlist = sortedMerge(left, right); 
        
        return sortedlist; 
    } 
  
    
    ListNode getMiddle(ListNode head) 
    { 
        if (head == null) 
            return head; 
  
        ListNode slow = head, fast = head; 
  
        while (fast.next != null && fast.next.next != null) 
        { 
            slow = slow.next; 
            fast = fast.next.next; 
        }
        
        return slow; 
    } 
    
    ListNode sortedMerge(ListNode l, ListNode r) 
    { 
        ListNode result = null; 
      
        if (l == null) 
            return r; 
        if (r == null) 
            return l; 
  
       
        if (l.val <= r.val)
        { 
            result = l; 
            result.next = sortedMerge(l.next, r); 
        }
        
        else
        { 
            result = r; 
            result.next = sortedMerge(l, r.next); 
        } 
        
        return result; 
    } 
    
} 


