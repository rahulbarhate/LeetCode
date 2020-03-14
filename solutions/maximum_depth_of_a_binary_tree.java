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
        if (root == null) return 0;
        int depth = 0;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int step = 0;
        while (!q.isEmpty())
        {
        	int s = q.size();
        	while (s -- > 0) 
            {
        		TreeNode curr = q.poll();
        		if (curr.left != null)
                    q.add(curr.left);
        		if (curr.right != null)
                    q.add(curr.right);
        	}
        	step++;
        }
        return step;
    }
}
