class Solution
{
    public int trailingZeroes(int n)
    {
        int nZero = 0;
        long currentMultiple = 5;
        while(n > 0)
        {
            n /= 5;
            nZero += n;
        }
        
        return nZero;
    }
}
