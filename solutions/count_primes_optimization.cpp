/* Time Complexity - O(N ^ 3/2) */


class Solution
{
public:
    
    bool isPrime(int n)
    {
        if(n<=1)
            return false;
        
        if(n<=3)
            return true;
        
        if(n%2==0 || n%3==0)
            return false;
        
        for(int i=5; i*i<=n; i = i+6)
        {
            if(n%i == 0 || n%(i+2)==0)
            {
                return false;
            }
        }
        
        return true;
        
    }
    
    int countPrimes(int n)
    {
        int result = 0;
        for(int i=2; i<n; i++)
        {
            if(isPrime(i))
            {
                result++;
            }                
        }
        return result;
    }
};
