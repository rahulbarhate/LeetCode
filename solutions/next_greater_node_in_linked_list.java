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
    public int[] nextLargerNodes(ListNode head)
    {
        ArrayList<Integer> A = new ArrayList<>();
        for(ListNode node = head; node != null; node = node.next)
        {
            A.add(node.val);
        }
        
        int[] result = new int[A.size()];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<A.size(); i++)
        {
            while(!stack.isEmpty() && A.get(stack.peek()) < A.get(i))
            {
                System.out.println("\n");
                result[stack.pop()] = A.get(i);
            }

            stack.push(i);
        }
         
        return result;
    }
}
