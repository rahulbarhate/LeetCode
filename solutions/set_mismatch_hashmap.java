public class Solution 
{
    public int[] findErrorNums(int[] nums) 
    {
       Map<Integer, Integer> seen = new HashMap<Integer, Integer>();
        int duplicate = -1, missing = -1;
        for(int num:nums)
        {
            seen.put(num, seen.getOrDefault(num, 0)+1);
        }
        
        for(int i=1; i<=nums.length; i++)
        {
            if(seen.containsKey(i))
            {
                if(seen.get(i) == 2)
                {
                    duplicate = i;
                }
            }
            
            else
            {
                missing = i;
            }
        }
        
        return new int[]{duplicate, missing};
    }
}
