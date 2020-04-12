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
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<Integer> depth = new Stack<>();
        
        
        stack.push(root);
        depth.push(1);
        
        int min_depth = Integer.MAX_VALUE;
        
        while(!stack.isEmpty())
        {
            TreeNode node = stack.pop();
            int current_depth = depth.pop();
            
            if(node.left == null && node.right == null)
            {        
                min_depth = Math.min(current_depth, min_depth);
            }
            
            if(node.right != null)
            { 
                stack.push(node.right);
                depth.push(current_depth+1);
            }
            
            if(node.left != null)
            {
                stack.push(node.left);
                depth.push(current_depth+1);
            }
            
        }
        return min_depth;
        
    }
}
