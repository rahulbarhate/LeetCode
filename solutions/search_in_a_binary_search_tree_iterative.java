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
    public TreeNode searchBST(TreeNode root, int val)
    {
        while(root != null && val != root.val)
            root = val < root.val ? root.left : root.right;
        
        return root;
    }
}
