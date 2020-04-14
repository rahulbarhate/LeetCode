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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) 
    {
        if(t1 == null)
            return t2;
        
        if(t2 == null)
            return t1;
        
        Queue<TreeNode[]> queue = new LinkedList<>();
        queue.offer(new TreeNode[] {t1, t2});
        
        while(!queue.isEmpty())
        {
            TreeNode[] tree = queue.poll();
            if(tree[0] == null || tree[1] == null)
                continue;
            
            tree[0].val += tree[1].val;
            if(tree[0].left == null)
            {
                tree[0].left = tree[1].left;
            }
            else
            {
                queue.offer(new TreeNode[] {tree[0].left, tree[1].left});
            }
            if(tree[0].right == null)
            {
                tree[0].right = tree[1].right;
            }
            else
            {
                queue.offer(new TreeNode[] {tree[0].right, tree[1].right});
            }
        }
        
        return t1;
    }
}
