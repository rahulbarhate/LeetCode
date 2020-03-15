// Space Optimization: Dynamic Programming

class Solution
{
    public int tribonacci(int n)
    {
        if(n<3)
            return n==0?0:1;
        
        int sum, first = 0, second = 1, third = 1;
        for(int i=3; i<=n; i++)
        {
            sum = first + second + third;
            first = second;
            second = third;
            third = sum;
        }
        
        return third;
    }
}
