class Solution
{
    private Integer[] cache = new Integer[31];
    
    public int fib(int N)
    {
        if(N <= 1)
            return N;
        
        cache[0] = 0;
        cache[1] = 1;
        return memorize(N);
    }
    
    
    public int memorize(int N)
    {
        if(cache[N] != null)
            return cache[N];
    
    
        cache[N] = memorize(N-1) + memorize(N-2);
        return memorize(N);  
    }
}
