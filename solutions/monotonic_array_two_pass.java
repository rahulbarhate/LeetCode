class Solution 
{
    public boolean isMonotonic(int[] A)
    {
        return increasing(A) || decreasing(A);
    }
    
    private boolean increasing(int[] A)
    {
        for(int i = 0; i < A.length - 1; i++)
        {
            if(A[i] > A[i+1])
            {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean decreasing(int[] A)
    {
        for(int i = 0; i < A.length - 1; i++)
        {
            if(A[i] < A[i+1])
            {
                return false;
            }
        }
        
        return true;
    }
}
