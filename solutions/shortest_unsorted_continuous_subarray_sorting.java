class Solution 
{
    public int findUnsortedSubarray(int[] nums)
    {
        int sortedNums[] = nums.clone();
        Arrays.sort(nums);
        
        int l = sortedNums.length, r = 0;
        for(int i=0; i<sortedNums.length; i++)
        {
            if(sortedNums[i] != nums[i])
            {
                l = Math.min(l, i);
                r = Math.max(r, i);
            }
        }
        
        return (r - l < 0 ? 0 : r - l + 1);
    }
}
