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
    public int findTilt(TreeNode root)
    {
        int tilt = 0;
        if(root == null)
           return 0;

        Stack<Integer> sums = new Stack<>();
        Stack<TreeNode> toVisit = new Stack<>();
        TreeNode calc = new TreeNode(0);
        
        toVisit.push(root);
        while(!toVisit.isEmpty())
        {
            TreeNode node = toVisit.pop();
            if(node == calc)
            {
                int left = sums.pop();
                int right  = sums.pop();
                tilt += Math.abs(left - right);
                sums.push(left + right + sums.pop());
                continue;
            }


            sums.push(node.val);
            toVisit.push(calc);

            if(node.left == null)
            {
                sums.push(0);
            }
            else
            {
                toVisit.push(node.left);
            }


            if(node.right == null)
            {
                sums.push(0);
            }

            else
            {
                toVisit.push(node.right);
            }
        }

        return tilt;
    }   
}
