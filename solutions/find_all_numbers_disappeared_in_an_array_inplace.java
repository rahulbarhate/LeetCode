class Solution
{
    public List<Integer> findDisappearedNumbers(int[] nums)
    {
        for(int i=0; i<nums.length; i++)
        {
            int index = Math.abs(nums[i]) - 1;
            
            if(nums[index] > 0)
            {
                nums[index] = -nums[index];
            }
        }
            
        List<Integer> output_arr = new LinkedList<Integer>();
            
        for(int i=1; i <= nums.length; i++)
        {
            if(nums[i-1] > 0)
            {
                output_arr.add(i);
            }
        }
        
        return output_arr;
    }
}
