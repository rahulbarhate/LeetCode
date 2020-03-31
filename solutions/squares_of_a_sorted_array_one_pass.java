class Solution 
{
    public int[] sortedSquares(int[] A)
    {
        int N = A.length;
        int[] output_arr = new int[N];
        
        int left = 0;
        int right = N-1;
        int p = N-1;
        
        while(left <= right)
        {
            int x = A[left] * A[left];
            int y = A[right] * A[right];
            
            if(x >= y)
            {
                output_arr[p]= x;
                left++;
                p--;
            }
            
            else
            {
                output_arr[p]= y;
                right--;
                p--;
            }
        }
        
        return output_arr;
    }
}
