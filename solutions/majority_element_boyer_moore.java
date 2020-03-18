class Solution 
{
    public int majorityElement(int[] nums)
    {
        int count = 0;
        Integer candidate = null;
        
        for(int i = 0; i < nums.length; i++)
        {
            if(count == 0)
            {
                candidate = nums[i];
                count = 1;
            }
            
            else
            {
                if(candidate == nums[i])
                    count++;
                else
                    count--;
            }
        }
        
        
        for(int i=0; i<nums.length; i++)
        {
            if(candidate == nums[i])
                count ++;
        }
        
        
        return (count>nums.length/2) ? candidate : null;
    }
}
