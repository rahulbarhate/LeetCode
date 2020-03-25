/**
 * Definition for a binary tree node.
 * public class TreeNode 
   {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution
{
   public boolean check(TreeNode p, TreeNode q)
    {
        
        
        return true;
        
    }
    
    public boolean isSameTree(TreeNode p, TreeNode q)
    { 
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(p);
        queue.offer(q);
        
        while(!queue.isEmpty())
        {
            TreeNode deqP = queue.poll();
            TreeNode deqQ = queue.poll();
           
            
            if(deqP == null && deqQ==null)
                continue;
        
            if(deqP == null || deqQ == null)
                return false;
        
            if(deqP.val != deqQ.val)
                return false;
            
            queue.offer(deqP.left);
            queue.offer(deqQ.left);
            queue.offer(deqP.right);
            queue.offer(deqQ.right);

        }
        
        return true;
    }
}
