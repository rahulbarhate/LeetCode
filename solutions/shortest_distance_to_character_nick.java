class Solution 
{
    public int[] shortestToChar(String S, char C)
    {
        int n = S.length();
        int[] output_arr = new int[n];
        int c_position = -n;
        
        for(int i=0; i<n; i++)
        {
            if(S.charAt(i) == C)
            {
                c_position = i;
            }
            
            output_arr[i] = i - c_position;
        }
        
        for(int i = n - 1; i >= 0; i--)
        {
            if(S.charAt(i) == C)
            {
                c_position = i;
            }
            
            output_arr[i] = Math.min(output_arr[i], Math.abs(c_position - i));
        }
        
        return output_arr;
    }
}
