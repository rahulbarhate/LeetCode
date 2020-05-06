class Solution 
{
  public int bitwiseComplement(int N)
  {
    if (N == 0)
    {
        return 1;
    } 
    int lengthCounter = N, bit = 1;
      
    while (lengthCounter != 0)
    {
      N = N ^ bit;
      bit = bit << 1;
      lengthCounter = lengthCounter >> 1;
    }
      
    return N;
  }
}
