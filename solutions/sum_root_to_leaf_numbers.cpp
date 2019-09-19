/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
    
public:
    
    
    int solve(TreeNode* root, int num)
    {
        if(root == NULL)
        {
            return 0;
        }
        
        int sum = num*10 + root->val;
        
        if(root->left == NULL && root->right == NULL)
            return sum;
        
        return (solve(root->left, sum) + solve(root->right, sum));
        
    }
    
    int sumNumbers(TreeNode* root)
    {
        
        return solve(root, 0);
    }
};