class Solution {
public:
    
    int rangeBitwiseAnd(int m, int n) 
    {
        while(m<n)
        {
            n = n - (n & -n); 
        }
        
        return n;
    }
        
    
};