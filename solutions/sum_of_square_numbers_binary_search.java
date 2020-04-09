class Solution 
{
    public boolean judgeSquareSum(int c)
    {
        for(long a = 0; a*a <= c; a++)
        {
            int b = c - (int)(a*a);
            
            if(binarySearch(0, b, b))
                return true;
        }
        
        return false;
    }
    
    public boolean binarySearch(long left, long right, int n)
    {
        if (left > right)
            return false;
        
        long mid = left + (right - left)/2;
        if(mid * mid == n)
            return true;
        if(mid * mid > n)
            return binarySearch(left, mid - 1, n);
        else
            return binarySearch(mid + 1, right, n); 
    }
}
