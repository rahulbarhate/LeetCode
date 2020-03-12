/* Time Complexity: O(N), where NN is length of the string. We iterate the length of dp array which is N+1.

Space Complexity: O(N). The length of the DP array.
*/


class Solution
{
    public int numDecodings(String s)
    {
        int[] dp = new int[s.length()+1];
        dp[0] = 1; //dp stores the number of ways of decoding a string of length x
        dp[1] = s.charAt(0) == '0' ? 0:1;
        for(int i=2; i<=s.length(); i++)
        {
            int oneDigit = Integer.valueOf(s.substring(i-1, i));
            int twoDigits = Integer.valueOf(s.substring(i-2, i));
            
            if(oneDigit >= 1)
            {
                dp[i] += dp[i-1];
            }
            
            if(twoDigits >= 10 && twoDigits <= 26)
            {
                dp[i] += dp[i-2];
            }
        }
        
        
        return(dp[s.length()]);
    }
    
}
