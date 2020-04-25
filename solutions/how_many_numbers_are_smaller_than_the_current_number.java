class Solution 
{
    public int[] smallerNumbersThanCurrent(int[] nums) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        int[] copy = nums.clone();
        
        Arrays.sort(copy);
        
        for(int i=0; i<nums.length; i++)
        {
            map.putIfAbsent(copy[i], i);
        }
        
        for(int i=0; i<nums.length; i++)
        {
            copy[i] = map.get(nums[i]);
        }
        
        return copy;
    }
}

// Time: O(nlogn)
// Space: O(n)
