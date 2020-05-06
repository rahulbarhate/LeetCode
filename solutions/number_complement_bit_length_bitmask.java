class Solution 
{
        public int findComplement(int num)
        {
            int length = (int)(Math.log(num) / Math.log(2)) + 1;
            
            int bitmask = (1 << length) - 1;
            
            return num ^ bitmask;
        }
}
