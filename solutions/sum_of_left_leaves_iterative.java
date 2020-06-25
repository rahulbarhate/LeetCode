/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution
{
    private boolean isLeaf(TreeNode node)
    {
        return node != null && node.left == null && node.right == null;
    }
    
    public int sumOfLeftLeaves(TreeNode root) 
    {
        if(root == null)
            return 0;
        
        int total = 0;
        Deque<TreeNode> stack = new ArrayDeque();
        stack.push(root);
        
        while(!stack.isEmpty())
        {
            TreeNode subRoot = stack.pop();
            
            if(isLeaf(subRoot.left))
            {
                total += subRoot.left.val;
            }
            
            if(subRoot.right != null)
            {
                stack.push(subRoot.right);
            }
            
            if(subRoot.left != null)
            {
                stack.push(subRoot.left);
            }
        }
        
        return total;
    }
}
