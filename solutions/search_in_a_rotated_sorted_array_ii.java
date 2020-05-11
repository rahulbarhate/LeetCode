class Solution
{
    public boolean search(int[] nums, int target)
    {
        int left = 0, right = nums.length-1;
        
        while (left <= right)
        {
            int mid = left + (right - left) / 2, n = nums[mid];
            
            if (n == target)
            {
                return true;
            }
            else if (n > nums[right]) 
            {
                //nums[left..mid] is sorted
                if (target >= nums[left] && target < n)
                {
                    right = mid - 1;
                } 
                
                else
                {
                    left = mid + 1;
                }
                
            } 
            
            else if (nums[left] > mid)
            {
                //nums[mid..right] is sorted
                if (target > n && target <= nums[right])
                {
                    left = mid + 1;
                }
                else
                {
                    right = mid - 1;
                }
            } 
            
            else
            {
                //left could be target
                if (target == nums[left])
                    return true;
                
                else 
                    left++;
            }
        }
        
        return false;
    }
}
