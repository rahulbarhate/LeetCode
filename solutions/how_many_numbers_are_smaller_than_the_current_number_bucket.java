class Solution 
{
    public int[] smallerNumbersThanCurrent(int[] nums) 
    {
        int[] bucket = new int[101];
        int[] count = new int[101];
        
        for(int i=0; i<nums.length; i++)
        {
            bucket[nums[i]]++;
        }
        
        for(int i=1; i<count.length; i++)
        {
            count[i] = count[i-1] + bucket[i-1];
        }
        
        for(int i=0; i<nums.length; i++)
        {
            nums[i] = count[nums[i]];
        }
        
        return nums;
    }
}
