class Solution
{
    public boolean isPerfectSquare(int num)
    {
        if(num < 2)
            return true;
        
        long left = 2, right = num/2, pivot, guessSquared;
        
        while(left <= right)
        {
            pivot = left + (right - left)/2;
            guessSquared = pivot*pivot;
            
            if(guessSquared == num)
            {
                return true;
            }
            
            if(guessSquared > num)
            {
                right = pivot - 1;
            }
            
            else
            {
                left = pivot + 1;
            }
        }
        
        return false;
    }
}
