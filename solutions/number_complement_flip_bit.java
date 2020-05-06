class Solution 
{
        public int findComplement(int num)
        {
            int loopCounter = num, bit = 1;
            while(loopCounter != 0)
            {
                num = num ^ bit;
                bit <<= 1;
                loopCounter >>= 1;
            }
            
            return num;
        }
}
