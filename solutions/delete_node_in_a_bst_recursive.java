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
    public int successor(TreeNode root)
    {
        root = root.right;
        while(root.left != null)
            root = root.left;
        
        return root.val;
    }
    
    public int predecessor(TreeNode root)
    {
        root = root.left;
        while(root.right != null)
            root = root.right;
        
        return root.val;
    }
    
    public TreeNode deleteNode(TreeNode root, int key)
    {
        if(root == null)
            return null;
        
        // delete from the right subtree
        if(key > root.val)
            root.right = deleteNode(root.right, key);
        
        // delete from the right subtree
        else if(key < root.val)
            root.left = deleteNode(root.left, key);
        
        // delete the current node
        else
        {
            // current node is a leaf node
            if(root.left == null && root.right == null)
                root = null;
            
            // the root is not a leaf and has a right child
            else if(root.right != null)
            {
                root.val = successor(root);
                root.right = deleteNode(root.right, root.val);
            }
            
            // the node is not a leaf, has no right child, and has a left child    
            else
            {
                root.val = predecessor(root);
                root.left = deleteNode(root.left, root.val);
            }
         } 
        
        return root;
    }
}
