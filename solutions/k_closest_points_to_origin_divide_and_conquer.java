class Solution
{
    public int[][] kClosest(int[][] points, int K)
    {
        int n =  points.length, start = 0, end = n - 1;
        while (start <= end)
        {
            int mid = helper(points, start, end);
            
            if (mid == K) 
                break;
            
            if (mid < K) 
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        
        return Arrays.copyOfRange(points, 0, K);
    }

    private int helper(int[][] A, int start, int end) 
    {
        int[] pivot = A[start];
        while (start < end)
        {
            while (start < end && compare(A[end], pivot) >= 0)
            {
                end--;
            }
                
            A[start] = A[end];
            
            while (start < end && compare(A[start], pivot) <= 0) 
            {
                start++;
            }
              
            A[end] = A[start];
        }

        A[start] = pivot;
        return start;
    }

    private int compare(int[] a, int[] b)
    {
        return ((a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1]));
    }
    
}
