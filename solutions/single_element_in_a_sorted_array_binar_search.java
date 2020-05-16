class Solution
{
    public int singleNonDuplicate(int[] nums) 
    {
        int start = 0;
        int end = nums.length - 1;
        
        while(start < end)
        {
            int mid = start + (end - start)/2;
            
            boolean halvesAreEven = (end - mid) % 2 == 0;
            
            if(nums[mid+1] == nums[mid])
            {
                if(halvesAreEven)
                {
                    start = mid + 2;
                }
                
                else
                {
                    end = mid - 1;
                }
            }
            
            else if(nums[mid - 1] == nums[mid])
            {
                if(halvesAreEven)
                {
                    end = mid - 2;
                }
                
                else
                {
                    start = mid + 1;
                }
            }
            
            else
            {
                return nums[mid];
            }
        }
        
        return nums[start];
    }
}
