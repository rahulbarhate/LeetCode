class Solution
{
    public int bitwiseComplement(int N)
    {
        int length = (int)(Math.log(N) / Math.log(2)) + 1;
        
        int bitmask = (1 << length) - 1;
        
        return N ^ bitmask;
        
    }
}
