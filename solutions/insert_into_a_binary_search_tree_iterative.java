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
    public TreeNode insertIntoBST(TreeNode root, int val)
    {
        TreeNode node = root;
        while(node != null)
        {
            if(val > node.val)
            {
                if(node.right == null)
                {
                    node.right = new TreeNode(val);
                    return root;
                }
                
                else
                {
                    node = node.right;
                }
            }
            
            else
            {
                if(node.left == null)
                {
                    node.left = new TreeNode(val);
                    return root;
                }
                else
                {
                    node = node.left;
                }
            }
        }
        
        return new TreeNode(val);
    }
}
