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
    public int maxDepth(TreeNode root) 
    {
        if (root == null) 
            return 0;
        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty())
        {
        	int size = queue.size();
        	while (size -- > 0) 
            {
        		TreeNode node = queue.poll();
        		if (node.left != null)
                    queue.add(node.left);
        		if (node.right != null)
                    queue.add(node.right);
        	}
        	depth++;
        }
        return depth;
    }
}
