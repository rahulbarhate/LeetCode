class Solution
{
public:
    
    int countPrimes(int n)
    {
        bool prime[n+1];
        memset(prime, true, sizeof(prime));
        int result = 0;
        
        for(int p=2; p*p <= n; p++)
        {
            if(prime[p] == true)
            {
                for(int i=p*p; i<=n; i = i+p)
                {
                    prime[i] = false;
                }
            }
        }
        
        for(int p=2; p<n; p++)
        {
            if(prime[p])
            {
                result++;
            }
        }
        
        return result;
    }
};
