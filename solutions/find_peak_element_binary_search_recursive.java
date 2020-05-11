class Solution
{
    public int findPeakElement(int[] nums)
    {
        return search(nums, 0, nums.length-1);
    }
    
    public int search(int[] nums, int low, int high)
    {
        if(low==high)
            return low;
        
        int mid = low + (high-low)/2;
        if(nums[mid] > nums[mid+1])
            return search(nums, low, mid);
        return search(nums, mid+1, high);
    }
}
