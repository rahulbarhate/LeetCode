class Solution
{
  public int hammingDistance(int x, int y)
  {
    int xor = x ^ y;
    System.out.println(xor);
    System.out.println("\n");
    
    int distance = 0;
    while (xor != 0)
    {
      distance += 1; 
      xor = xor & (xor - 1);
    }
    return distance;
  }
}
