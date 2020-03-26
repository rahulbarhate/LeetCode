class Solution
{
    public int thirdMax(int[] nums)
    {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num:nums)
            set.add(num);
        
        int maximum = Collections.max(set);
        
        if(set.size() < 3)
            return maximum;
        
        set.remove(maximum);
        int secondMaximum = Collections.max(set);
        set.remove(secondMaximum);
        return Collections.max(set);
    }
}
