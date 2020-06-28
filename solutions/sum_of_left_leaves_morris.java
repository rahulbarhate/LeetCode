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
    public int sumOfLeftLeaves(TreeNode root) 
    {
        int totalSum = 0;
        TreeNode currentNode = root;
        
        while(currentNode != null)
        {
            if(currentNode.left == null)
            {
                currentNode = currentNode.right;
            }
                
            else
            {
                TreeNode previous = currentNode.left;
                if(previous.left == null && previous.right == null)
                {
                    totalSum += previous.val;
                }   
            
                while(previous.right != null && !previous.right.equals(currentNode))
                {
                    previous = previous.right;
                }
                
                if(previous.right == null)
                {
                    previous.right = currentNode;
                    currentNode = currentNode.left;
                }

                else
                {
                    previous.right = null;
                    currentNode = currentNode.right;
                }
             }
        }
        
        return totalSum;
    }
}
