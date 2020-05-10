class Solution
{
    public int findNumbers(int[] nums) 
    {
        int count  = 0;
        for(int number:nums)
        {
            if(String.valueOf(number).length() % 2 == 0)
            {
                count++;
            }
        }
        
        return count;
    }
}
