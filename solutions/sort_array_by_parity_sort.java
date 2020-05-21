class Solution 
{
    public int[] sortArrayByParity(int[] A)
    {
        Integer[] B = new Integer[A.length];
        for(int i = 0; i<A.length; i++)
        {
            B[i] = A[i];
        }
        
        Arrays.sort(B, (a,b) -> Integer.compare(a%2, b%2));
        
        for(int i = 0; i < A.length; i++)
        {
            A[i] = B[i];
        }
        
        return A;
    }
}

