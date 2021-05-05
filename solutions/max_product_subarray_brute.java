class Solution 
{
    public int maxProduct(int[] nums) 
    {
        if (nums.length == 0) return 0;

        int result = nums[0];

        for (int i = 0; i < nums.length; i++) 
        {
            int product = 1;
            for (int j = i; j < nums.length; j++) 
            {
                product *= nums[j];
                result = Math.max(result, product);
            }
        }

        return result;
    }
}
