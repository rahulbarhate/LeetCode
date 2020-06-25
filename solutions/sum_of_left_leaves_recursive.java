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
        
        return processSubTree(root, false);
    }
    
    private int processSubTree(TreeNode subTree, boolean isLeft)
    {
        if(subTree.left == null && subTree.right == null)
        {
            return isLeft ? subTree.val : 0;
        }
        
        int total = 0;
        if(subTree.left != null)
        {
            total += processSubTree(subTree.left, true);
        }
        
        if(subTree.right != null)
        {
            total += processSubTree(subTree.right, false);
        }
        
        return total;
    }
}
