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
    public int diameterOfBinaryTree(TreeNode root)
    {
        Map<TreeNode, Integer> map = new HashMap<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        
        int diameter = 0;
        
        if(root != null)
        {
            stack.push(root);
        }
        
        while(!stack.isEmpty())
        {
            TreeNode node = stack.peek();
            
            if(node.left != null && !map.containsKey(node.left))
            {
                stack.push(node.left);
            }
            
            else if(node.right != null && !map.containsKey(node.right))
            {
                stack.push(node.right);
            }
            
            else
            {
                stack.pop();
                int leftHeight = map.getOrDefault(node.left, 0);
                int rightHeight = map.getOrDefault(node.right, 0);
                
                map.put(node, 1 + Math.max(leftHeight, rightHeight));
                diameter = Math.max(diameter, leftHeight + rightHeight);
            }
        }
        
        return diameter;
    }
}
