class Solution
{
    public int dominantIndex(int[] nums) 
    {
        if(nums == null || nums.length <=1)
            return 0;
        int max = -1, secondMax = -1, maxIndex = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(max < nums[i])
            {
                secondMax = max;
                max = nums[i];
                maxIndex = i;
            }
            else if(secondMax < nums[i])
            {
                secondMax = nums[i];
            }
        }
        
        return max >= 2 * secondMax ? maxIndex : -1;
    }
}
