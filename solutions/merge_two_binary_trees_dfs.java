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
        
        Stack<TreeNode[]> stack = new Stack<>();
        stack.push(new TreeNode[] {t1, t2});
        
        while(!stack.isEmpty())
        {
            TreeNode[] tree = stack.pop();
            if(tree[0] == null || tree[1] == null)
                continue;
            
            tree[0].val += tree[1].val;
            if(tree[0].left == null)
            {
                tree[0].left = tree[1].left;
            }
            else
            {
                stack.push(new TreeNode[] {tree[0].left, tree[1].left});
            }
            if(tree[0].right == null)
            {
                tree[0].right = tree[1].right;
            }
            else
            {
                stack.push(new TreeNode[] {tree[0].right, tree[1].right});
            }
        }
        
        return t1;
    }
}
