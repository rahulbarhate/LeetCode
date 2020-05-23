class Solution
{
    public int mySqrt(int x)
    {
        if(x<2)
            return x;
        
        double x0 = x;
        double x1 = (x0 + x/x0)/2.0;
        
        while(Math.abs(x0-x1) >= 1)
        {
            x0 = x1;
            x1 = (x0 + x/x0)/2.0;
        }
        
        return (int)x1;
    }
}
