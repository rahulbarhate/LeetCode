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
    int no_of_nodes = 0;
    
    
    public int diameterOfBinaryTree(TreeNode root) 
    {
        height(root);
        return no_of_nodes;
        
    }
    
    public int height(TreeNode root)
    {
        if(root == null)
            return 0;
        
        int left = height(root.left);
        int right = height(root.right);
        
        no_of_nodes = Math.max(no_of_nodes, left+right);
        
        return Math.max(left, right) + 1;
        
    }
}
