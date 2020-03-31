class Solution 
{
    public int[] sortedSquares(int[] A)
    {
        int n = A.length;
        int[] output_arr = new int[n];
        for(int i=0; i<n; i++)
        {
            output_arr[i] = A[i] * A[i];
        }
        
        Arrays.sort(output_arr);
        return output_arr;            
        
    }
}
