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
    int recordedDepth = -1;
    boolean isCousin = false;
    
    
    private boolean dfs(TreeNode node, int depth, int x, int y)
    {
        if(node == null)
        {
            return false;
        }
        
        if(this.recordedDepth != - 1 && depth > this.recordedDepth)
        {
            return false;
        }
        
        if (node.val == x || node.val == y)
        {
            if(this.recordedDepth == -1)
            {
                this.recordedDepth = depth;
            }
            
            return this.recordedDepth == depth;
        }
        
        boolean left = dfs(node.left, depth + 1, x, y);
        boolean right = dfs(node.right, depth + 1, x, y);
        
        // this.recordedDepth != depth + 1 ensures that x and y are not
        // immediate child nodes, otherwise they would become siblings.
        if(left && right && this.recordedDepth != depth + 1)
        {
            this.isCousin = true;
        }
        
        return left || right;
        
    }
    public boolean isCousins(TreeNode root, int x, int y)
    {
        dfs(root, 0 , x, y);
        return this.isCousin;
    }
}
