class Solution
{
    public int missingNumber(int[] nums)
    {
        Set<Integer> seen = new HashSet<Integer>();
        for(int num:nums)
            seen.add(num);
        
        int expectedNumCount = nums.length + 1;
        for(int i=0; i<expectedNumCount; i++)
        {
            if(!seen.contains(i))
                return i;
        }
        
        return -1;
    }
}
