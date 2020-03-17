class Solution 
{
    public int singleNumber(int[] nums)
    {
        Set<Long> set = new HashSet<>();
        long sumSet = 0, sumArray = 0;
        
        for(int n: nums)
        {
            sumArray += n;
            set.add((long)n);
        }
        
        for(Long s:set)
            sumSet += s;
        
        return (int)((3*sumSet - sumArray)/2);
    }
}
