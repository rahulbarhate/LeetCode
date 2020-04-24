class Solution
{
    public void duplicateZeros(int[] arr)
    {
        int countZeros = 0;
        int n = arr.length - 1;

       
        for (int i = 0; i <= n - countZeros; i++) 
        {
            if (arr[i] == 0)
            {
                if (i == n - countZeros)
                {
                    arr[n] = 0;
                    n -= 1;
                    break;
                }
                countZeros++;
            }
        }

      
        int last = n - countZeros;

 
        for (int i = last; i >= 0; i--)
        {
            if (arr[i] == 0)
            {
                arr[i + countZeros] = 0;
                countZeros--;
                arr[i + countZeros] = 0;
            } 
            else
            {
                arr[i + countZeros] = arr[i];
            }
        }
        
        
    }
}
