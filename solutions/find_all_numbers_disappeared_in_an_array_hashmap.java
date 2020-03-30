class Solution
{
    public List<Integer> findDisappearedNumbers(int[] nums)
    {
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for(int i=0; i<nums.length; i++)
        {
            map.put(nums[i], true);
        }
        
        List<Integer> output_arr = new ArrayList<Integer>();
        for(int i=1; i<=nums.length; i++)
        {
            if(!map.containsKey(i))
            {
                output_arr.add(i);
            }
        }
        
        return output_arr;
    }
}
