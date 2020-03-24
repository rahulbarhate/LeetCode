public class Solution 
{
    public int[] findErrorNums(int[] nums) 
    {
        int[] arr = new int[nums.length+1];
        int duplicate = -1, missing = -1;
        for(int i=0; i<nums.length; i++)
            arr[nums[i]] += 1;
        
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] == 0)
                missing = i;
            
            else if(arr[i] == 2)
                duplicate = i;
        }
            
        return new int[]{duplicate, missing};
    }
}
