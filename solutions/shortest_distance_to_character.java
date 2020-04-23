class Solution 
{
    public int[] shortestToChar(String S, char C)
    {
        int n = S.length();
        int[] output_arr = new int[n];
        int c_position = Integer.MIN_VALUE/2;
        
        for(int i=0; i<n; i++)
        {
            if(S.charAt(i) == C)
            {
                c_position = i;
            }
            
            output_arr[i] = i - c_position;
        }
        
        c_position = Integer.MAX_VALUE/2;
        
        for(int i = n - 1; i >= 0; i--)
        {
            if(S.charAt(i) == C)
            {
                c_position = i;
            }
            
            output_arr[i] = Math.min(output_arr[i], c_position - i);
        }
        
        return output_arr;
    }
}
