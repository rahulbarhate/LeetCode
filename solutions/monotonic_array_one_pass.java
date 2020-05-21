class Solution
{
    public boolean isMonotonic(int[] A) 
    {
        int variabeComparator = 0;
        for(int i = 0; i < A.length - 1; i++)
        {
            int c = Integer.compare(A[i], A[i+1]);
            if(c != 0)
            {
                if(c != variabeComparator && variabeComparator != 0)
                {
                    return false;
                }
                
                variabeComparator = c;
            }
        }
        
        return true;
    }
}
