class Solution 
{
    public int crossSum(int[] nums, int left, int right, int mid)
    {
        if(left == right)
            return nums[left];
        
        int leftSubSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = mid; i > left - 1; i--)
        {
            currSum += nums[i];
            leftSubSum = Math.max(currSum, leftSubSum);
        }
        
        int rightSubSum = Integer.MIN_VALUE;
        currSum = 0;
        for(int i = mid+1; i < right + 1; i++)
        {
            currSum += nums[i];
            rightSubSum = Math.max(currSum, rightSubSum);
        }
        
        return leftSubSum + rightSubSum;
    }
    public int helper(int[] nums, int left, int right)
    {
        if(left == right)
            return nums[left];
        
        int mid = left + (right-left)/2;
        
        int leftSum = helper(nums, left, mid);
        int rightSum = helper(nums, mid+1, right);
        int crossSum = crossSum(nums, left, right, mid);
        
        return Math.max(Math.max(leftSum, rightSum), crossSum);
    }
    public int maxSubArray(int[] nums) 
    {
        return helper(nums, 0, nums.length-1);
    }
}
