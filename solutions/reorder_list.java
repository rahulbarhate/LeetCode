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
  public void reorderList(ListNode head) 
  {
    if (head == null) 
        return;

    // find the middle
    ListNode slow = head, fast = head;
      
    while (fast != null && fast.next != null)
    {
      slow = slow.next;
      fast = fast.next.next;
    }

    // reverse the second part of the list
    
    ListNode previous = null, current = slow, temp;
      
    while (current != null)
    {
      temp = current.next;
      current.next = previous;
      previous = current;
      current = temp;
    }

    // merge two sorted linked lists
    ListNode first = head, second = previous;
      
    while (second.next != null) 
    {
      temp = first.next;
      first.next = second;
      first = temp;

      temp = second.next;
      second.next = first;
      second = temp;
    }
  }
}
