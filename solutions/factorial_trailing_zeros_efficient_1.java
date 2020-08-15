class Solution
{
    public int trailingZeroes(int n)
    {
        int nZero = 0;
        long currentMultiple = 5;
        while(n >= currentMultiple)
        {
            nZero += (n/currentMultiple);
            currentMultiple *= 5;
        }
        
        return nZero;
    }
}
