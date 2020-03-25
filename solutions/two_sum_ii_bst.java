/**
 * Definition for a binary tree node.
 * public class TreeNode
   {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution
{
    public boolean findTarget(TreeNode root, int k) 
    {
        List<Integer> list = new ArrayList();
        inorder(root, list);
        int left = 0, right = list.size()-1;
        
        while(left<right)
        {
            int sum = list.get(left) + list.get(right);
            if(sum == k)
                return true;
            else if(sum<k)
                left++;
            else
                right--;
        }
        
        return false;
        
    }
    
    public void inorder(TreeNode root, List<Integer> list)
    {
        if(root == null)
            return;
        
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
    
}
