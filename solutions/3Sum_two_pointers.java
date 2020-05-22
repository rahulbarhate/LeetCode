class Solution
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i = 0; i < nums.length && nums[i] <= 0; i++)
        {
            if(i == 0 || nums[i] != nums[i-1])
            {
                twoSum(nums, i, result);
            }
        }
        
        return result;
    }
    
    void twoSum(int[] nums, int i, List<List<Integer>> result)
    {
        int start = i+1;
        int end = nums.length - 1;
        
        while(start < end)
        {
            int sum = nums[i] + nums[start] + nums[end];
            
            if(sum < 0 || (start > i+1 && nums[start] == nums[start - 1]))
            {
                start++;
            }
            
            else if(sum > 0 || (end < nums.length - 1 && nums[end] == nums[end + 1]))
            {
                end--;
            }
            
            else
            {
                result.add(Arrays.asList(nums[i], nums[start], nums[end]));
            }
        }
    }
}
