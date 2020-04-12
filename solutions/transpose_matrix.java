class Solution 
{
    public int[][] transpose(int[][] A) 
    {
        int R = A.length, C = A[0].length;
        
        int[][] ans = new int[C][R];
        
        for (int i = 0; i < R; i++)
            for (int j = 0; j < C; j++)
            {
                ans[j][i] = A[i][j];
            }
        return ans;
    }
}
