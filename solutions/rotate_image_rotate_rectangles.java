class Solution
{
    
    public void swap(int[][] matrix, int i, int j, int k, int l)
    {
        int temp = matrix[k][l];
        matrix[k][l] = matrix[i][j];
        matrix[i][j] = temp;
    }
    
    public void rotate(int[][] matrix)
    {
        int low = 0;
        int high = matrix.length - 1;
        
        while(low < high)
        {
            int length = high - low;
            
            for(int i=0; i<length; i++)
            {
                int index = low + i;
                swap(matrix, low + i, high, low, index);
                swap(matrix, high, high -i, low, index);
                swap(matrix, high -i, low, low, index);
            }
                    
            low ++;
            high --;
        }
    }
}
