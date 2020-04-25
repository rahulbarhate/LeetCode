class Solution
{
    public int[] productExceptSelf(int[] nums)
    {
        int n = nums.length;
        
        int[] L = new int[n];
        
        int[] answer = new int[n];
        
        answer[0] = 1;
        for(int i=1; i<n; i++)
        {
            answer[i] = answer[i-1] * nums[i-1];
        }
        
        int R = 1;
        for(int i = n-1; i>=0; i--)
        {
            answer[i] = answer[i] * R;
            R = R * nums[i];
        }
                
        return answer;
    }
}
