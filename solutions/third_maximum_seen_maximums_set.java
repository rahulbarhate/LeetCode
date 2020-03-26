class Solution
{
    public int thirdMax(int[] nums)
    {
        Set<Integer> seenMaximums = new HashSet<>();
        
        for(int i=0; i<3; i++)
        {
            Integer currentMaximum = maxIgnoringSeenMaximums(nums, seenMaximums);
            if(currentMaximum == null)
                return Collections.max(seenMaximums);
            
            else
                seenMaximums.add(currentMaximum);
        }
        
         return Collections.min(seenMaximums);
    }
    
    private Integer maxIgnoringSeenMaximums(int[] nums, Set<Integer> seenMaximums)
    {
        Integer maximum = null;
        for(int num: nums)
        {
            if(seenMaximums.contains(num))
                continue;
            
            if(maximum == null || num>maximum)
                maximum = num;
        }
        
        return maximum;
    }
   
}
