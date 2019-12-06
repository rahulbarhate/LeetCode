class Solution {
public:
    
    int calculatemsb(int n)
    {
        int msb = -1;
        while(n)
        {
            int n = n>>1;
            msb++;
        }
        return msb;
    }
    
    int rangeBitwiseAnd(int m, int n) 
    {
        int result = 0;
        
        while(m && n)
        {
            int msb_n1=calculatemsb(m);
            int msb_n2=calculatemsb(n);
            
            if(msb_n1 != msb_n2)
                break;
            
            int msb_value = (1 << msb_n1);
            result += msb_value;
            m -= msb_value;
            n -= msb_value;
        }
        
        return result;
    }
        
    
};