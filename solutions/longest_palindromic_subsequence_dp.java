/*

Consider the string - BABCBAB

L(i,j) - length of the longest palindromic subsequence in a string from index i to j

B A B C B A B
0 1 2 3 4 5 6

Thus L(0,6) - length of longest palin subse
If characters at 0 and 6 are the same -> L(0,6) = L(1,5) + 2
Else, L(0,6) = max (L(0,5), L(1,6))



If characters i and j are the same -> L[i][j] = L[i+1][j-1] + 2
Else, L[i][j] = max(L[i][j-1], L[i+1][j])

*/

class Solution 
{
    public int longestPalindromeSubseq(String s)
    {
        int[][] dp = new int[s.length()][s.length()];
        
        for(int i = s.length()-1; i>=0; i--)
        {
            dp[i][i] = 1;
            for(int j = i+1; j<s.length(); j++)
            {
                if(s.charAt(i) == s.charAt(j))
                {
                    dp[i][j] = dp[i+1][j-1]+2;
                }
                else
                {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }
        return dp[0][s.length()-1];
    }
}
