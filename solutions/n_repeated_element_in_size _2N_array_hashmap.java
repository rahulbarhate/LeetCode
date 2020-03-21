class Solution
{
    public int repeatedNTimes(int[] A) 
    {
        Map<Integer, Integer> count = new HashMap();
        for(int x:A)
        {
            count.put(x, count.getOrDefault(x, 0)+1);
        }
        
        for(int x:count.keySet())
        {
            if(count.get(x)>1)
                return x;
        }
        
        return 0;
    }
}
