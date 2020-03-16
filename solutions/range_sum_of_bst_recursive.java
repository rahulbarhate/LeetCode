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
    int sum;
    public int rangeSumBST(TreeNode root, int L, int R)
    {
        sum = 0;
        get_range_sum(root, L, R);
        return sum;
    }
    
    public void get_range_sum(TreeNode root, int L, int R)
    {
        if(root != null)
        {
            if(root.val >= L && root.val <= R)
            {
                sum += root.val;
            }
            
            if(root.val > L)
            {
                get_range_sum(root.left, L, R);
            }
            
            if(root.val < R)
            {
                get_range_sum(root.right, L, R);
            }
        }
    }
    
}
