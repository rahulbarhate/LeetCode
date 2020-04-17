class Solution
{
    public int searchInsert(int[] nums, int target)
    {
        int mid, low = 0, high = nums.length-1;
        while(low <= high)
        {
            mid = (high + low) >>> 1;
            
            if(nums[mid] == target)
                return mid;
            
            if(target < nums[mid])
                high = mid - 1;
            
            else
                low = mid + 1;
        }
        
        return low;
    }
}
