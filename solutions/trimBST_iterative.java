class Solution{
    
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return root;
        }
        
        while (root.val < low || root.val > high) {
            if (root.val < low) {
                root = root.right;
            }
            if (root.val > high) {
                root = root.left;
            }
        }
        TreeNode dummy = root;
        
        while (dummy != null) {
            while (dummy.left != null && dummy.left.val < low) {
                dummy.left = dummy.left.right;  
            }
            dummy = dummy.left;
        }
        
        
        dummy = root;
        while (dummy != null) {
            while (dummy.right != null && dummy.right.val > high) {
                dummy.right = dummy.right.left;
            }
            dummy = dummy.right;
        }
        return root;
    }
}
