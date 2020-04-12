/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution
{
    public int minDepth(TreeNode root)
    {
        if(root == null)
            return 0;
        
        int min_depth = 1;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        
        while(!queue.isEmpty())
        {
            int n = queue.size();
            
            for(int i=0; i<n; i++)
            {
                TreeNode node = queue.poll();
                if(node.left == null && node.right == null)
                {
                    return min_depth;
                }
                
                if(node.left != null)
                {
                    queue.offer(node.left);
                }
                
                if(node.right != null)
                {
                    queue.offer(node.right);
                }
            }
            
            min_depth++;
        }
        
        return min_depth;
    }
}
