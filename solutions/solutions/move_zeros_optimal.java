class Solution 
{
    public void moveZeroes(int[] nums)
    {
        for(int lastZeroAt = 0, current = 0; current<nums.length; current++)
        {
            if(nums[current] != 0)
            {
                int temp = nums[lastZeroAt];
                nums[lastZeroAt] = nums[current];
                nums[current] = temp;
                lastZeroAt++;
            }
        }
    }
}
