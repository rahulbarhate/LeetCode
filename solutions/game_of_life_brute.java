class Solution 
{
    public void gameOfLife(int[][] board) 
    {
        int[] neighbors = {0, 1, -1};
        int rows = board.length;
        int cols = board[0].length;
        
        int[][] copyBoard = new int[rows][cols];
        
        for(int row=0; row<rows; row++)
        {
            for(int col= 0; col<cols; cols++)
            {
                copyBoard[row][col] = board[row][col];
            }
        }
        
        for(int row=0; row<rows; row++)
        {
            for(int col= 0; col<cols; cols++)
            {
                int liveNeighbors = 0;
                
                for(int i=0; i<3; i++)
                {
                    for(int j=0; j<3; j++)
                    {
                        if(!(neighbors[i] == 0 && neighbors[j] == 0))
                        {
                            int r = (row + neighbors[i]);
                            int c = (col + neighbors[j]);
                        
                        
                            if((r < rows && r >= 0) && (c < cols && c >= 0) && copyBoard[r][c] == 1)
                            {
                                liveNeighbors += 1;
                            }
                        }   
                    }
                }
            
                if((copyBoard[row][col] == 1) && (liveNeighbors < 2 || liveNeighbors > 3))
                {
                    board[row][col] = 0;
                }
                
                if(copyBoard[row][col] == 0 && liveNeighbors == 3)
                {
                    board[row][col] = 1;
                }
            }
        }
    }
}
