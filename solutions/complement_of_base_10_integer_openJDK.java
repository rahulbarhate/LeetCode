class Solution 
{
  public int bitwiseComplement(int N)
  {
      if(N == 0)
          return 1;
      
      int bitmask = N;
      bitmask |= (bitmask >> 1);
      bitmask |= (bitmask >> 2);
      bitmask |= (bitmask >> 4);
      bitmask |= (bitmask >> 8);
      bitmask |= (bitmask >> 16);
      
      return bitmask ^ N;
      
  }
}
