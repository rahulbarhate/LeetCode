class Solution 
{
    public:
        bool judgeSquareSum(int c)
        {
            for(long long a = 0; a*a <=c; a++)
            {
                for(long long b = 0; b*b <= c; b++)
                {
                    if(a*a + b*b == c)
                        return true;
                }
            }

            return false;
        }
};
