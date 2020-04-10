class Solution
{
    public int[] searchRange(int[] nums, int target) 
    {
        int[] targetRange = {-1, -1};
        
        
        
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == target)
            {
                targetRange[0] = i;
                break;
            }
        }
        
        
        if(targetRange[0] == -1)
        {
            return targetRange;
        }
        
        for(int j = nums.length - 1; j>=0 ; j--)
        {
            if(nums[j] == target)
            {
                targetRange[1] = j;
                break;
            }
        }
        
        return targetRange;
    }
}
