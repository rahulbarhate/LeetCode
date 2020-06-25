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
        return processSubTree(root, false);
    }
    
    private int processSubTree(TreeNode subTree, boolean isLeft)
    {
        if(subTree == null)
            return 0;
        
        
        if(subTree.left == null && subTree.right == null)
        {
            return isLeft ? subTree.val : 0;
        }
        
        
        return processSubTree(subTree.left, true) + processSubTree(subTree.right, false);
    }
}
