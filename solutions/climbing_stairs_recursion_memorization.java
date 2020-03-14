/*

Approach 2: Recursion with Memoization
Algorithm

In the brute approach we were redundantly calculating the result for every step.
Instead, we can store the result at each step in memomemo array and directly returning the result
from the memo array whenever that function is called again.

In this way we are pruning recursion tree with the help of memomemo array and reducing the size of recursion tree upto nn.

*/
class Solution 
{
    public int climbStairs(int n)
    {
        int memo[] = new int[n+1];
        return climb_Stairs(0,n, memo);
    }
    
    public int climb_Stairs(int i, int n, int memo[])
    {
        if(i>n)
            return 0;
        if(i==n)
            return 1;
        if(memo[i]>0)
            return memo[i];
        
        memo[i] = climb_Stairs(i+1, n, memo) + climb_Stairs(i+2, n, memo);
        return memo[i];
    }
    
}
