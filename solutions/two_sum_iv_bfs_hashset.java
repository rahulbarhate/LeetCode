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
    public boolean findTarget(TreeNode root, int k) 
    {
        Set<Integer> set = new HashSet();
        Queue<TreeNode> queue = new LinkedList();
        
        queue.add(root);
        while(!queue.isEmpty())
        {
            if(queue.peek()!=null)
            {
                TreeNode node = queue.remove();
                if(set.contains(k-node.val))
                {
                    return true;
                }
                set.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
                
            }
            else
            {
                queue.remove();
            }
        }
        return false;
    }
    
}
