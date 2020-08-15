class Solution
{
    public int trailingZeroes(int n)
    {
        int nZero = 0;
        for(int i = 5; i <= n; i+=5)
        {
            int currentFactor = i;
            while(currentFactor % 5 == 0)
            {
                nZero++;
                currentFactor /= 5;
            }
        }
        
        return nZero;
    }
}
