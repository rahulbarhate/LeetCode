?*

Algorithm

In the above approach we have used dpdp array where dp[i]=dp[i-1]+dp[i-2].
It can be easily analysed that dp[i] is nothing but i th fibonacci number.

Fib(n)=Fib(n-1)+Fib(n-2)

Now we just have to find n th number of the fibonacci series having 11 and 22 their first and second term respectively,
i.e. Fib(1)=1 and Fib(2)=2.

*/

class Solution 
{
    public int climbStairs(int n)
    {
        if(n==1)
        {
            return 1;
        }
        
        int first = 1;
        int second = 2;
        for(int i=3; i<=n; i++)
        {
            int third = first + second;
            first = second;
            second = third;
        }
        
        return second;
    }
     
}
