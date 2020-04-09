class Solution
{
    public boolean isPerfectSquare(int num) 
    {
        // Addition of first n odd numbers is always a perfect square
        
        int i=1;
        while(num > 0)
        {
            num -=i;
            i += 2;
        }
        
        return num == 0;
    }
}
