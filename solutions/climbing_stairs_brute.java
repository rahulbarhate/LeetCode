/*

Approach 1: Brute Force
Algorithm

In this brute force approach we take all possible step combinations i.e. 1 and 2, at every step. 
At every step we are calling the function climbStairsclimbStairs for step 11 and 22, and return the sum of returned values 
of both functions.

climbStairs(i,n)=(i + 1, n) + climbStairs(i + 2, n)

where i defines the current step and nn defines the destination step.

*/

class Solution 
{
    public int climbStairs(int n)
    {
        return climb_Stairs(0,n);
    }
    
    
    public int climb_Stairs(int i, int n)
    {
        if(i>n)
        {
            return 0;
        }
        
        if(i==n)
        {
            return 1;
        }
        
        return climb_Stairs(i+1,n) + climb_Stairs(i+2, n);
    }
}
