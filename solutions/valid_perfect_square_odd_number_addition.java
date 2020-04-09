class Solution
{
    public boolean isPerfectSquare(int num) 
    {
        // Addition of first n odd numbers is always a perfect square
        
        for(int sum = 0, i = 1; sum < num; i += 2)
        {
            sum += i;
            if(sum == num)
                return true;
        }
        
        return false;
    }
}
