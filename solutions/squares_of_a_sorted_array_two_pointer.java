class Solution 
{
    public int[] sortedSquares(int[] A)
    {
        int N = A.length;
        int positive_pointer = 0;
        
        while(positive_pointer < N && A[positive_pointer] < 0)
            positive_pointer++;
        
        int negative_pointer = positive_pointer-1;
        
        int[] sorted_squares = new int[N];
        int counter = 0;
        
        while(negative_pointer >= 0 && positive_pointer < N)
        {
            if(A[negative_pointer] * A[negative_pointer] < A[positive_pointer] * A[positive_pointer])
            {
                sorted_squares[counter] = A[negative_pointer] * A[negative_pointer];
                negative_pointer--;
            }
            else
            {
                sorted_squares[counter] = A[positive_pointer] * A[positive_pointer];
                positive_pointer++;
            }
            
            counter++;
        }
        
        while(negative_pointer >= 0)
        {
            sorted_squares[counter] = A[negative_pointer] * A[negative_pointer];
            negative_pointer--;
            counter++;
        }
        
        while(positive_pointer < N)
        {
            sorted_squares[counter] = A[positive_pointer] * A[positive_pointer];
            positive_pointer++;
            counter++;
        }
        
        return sorted_squares;
    }
}
