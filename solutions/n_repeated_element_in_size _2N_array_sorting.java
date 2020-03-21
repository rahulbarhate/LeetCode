class Solution
{
    public int repeatedNTimes(int[] A) 
    {
        Arrays.sort(A);
        for(int i=0; i<A.length-1; i++)
        {
            if(A[i] == A[i+1])
                return A[i];
        }
        
        return 0;
    }
}
