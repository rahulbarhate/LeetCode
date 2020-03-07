class Solution 
{
        public int findComplement(int num)
        {
            int k = (int) (Math.log(num)/Math.log(2));
            int highestOneBit = (int) Math.pow(2, k);
            int mask = (highestOneBit << 1) - 1;
            num = ~num;
            return num & mask;    
        }
}
