class Solution
{    
    public int fib(int N)
    {
        if(N <= 1)
            return N;
        
        if(N == 2)
            return 1;
        
        int sum = 0;
        int first = 1;
        int second = 1;
        
        for(int i=3; i<=N; i++)
        {
            sum = first + second;
            first = second;
            second = sum;
        }
        
        return sum;
    }
}
