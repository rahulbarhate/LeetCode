class Solution 
{
    public void setZeroes(int[][] matrix)
    {
        int MODIFIED = -100000;
        int r = matrix.length;
        int c = matrix[0].length;
        
        for(int i = 0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                if(matrix[i][j] == 0)
                {
                    for(int k=0; k<c; k++)
                    {
                        if(matrix[i][k]!=0)
                        {
                            matrix[i][k] = MODIFIED;
                        }
                    }
                    
                    for(int k=0; k<r; k++)
                    {
                        if(matrix[k][j]!=0)
                        {
                            matrix[k][j] = MODIFIED;
                        }
                    }
                }   
            }
        }
        
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                if(matrix[i][j] == MODIFIED)
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
