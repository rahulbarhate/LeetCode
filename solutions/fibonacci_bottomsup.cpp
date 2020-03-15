class Solution
{
    public int fib(int N)
    {
        if(N <= 1)
            return N;
        return memorization(N);
    }
    
    
    public int memorization(int N)
    {
        int[] cache = new int[N+1];
        cache[1] = 1;
        
        for(int i=2; i<=N; i++)
        {
            cache[i] = cache[i-1] + cache[i-2];
        }
        
        return cache[N];
    }
}
