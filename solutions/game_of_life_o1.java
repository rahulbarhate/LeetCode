lass Solution {
    public void gameOfLife(int[][] board) {

        
        int[] neighbors = {0, 1, -1};

        int rows = board.length;
        int cols = board[0].length;

       
        for (int row = 0; row < rows; row++) 
        {
            for (int col = 0; col < cols; col++) 
            {
                int liveNeighbors = 0;

                for (int i = 0; i < 3; i++) 
                {
                    for (int j = 0; j < 3; j++) 
                    {

                        if (!(neighbors[i] == 0 && neighbors[j] == 0)) 
                        {
                            int r = (row + neighbors[i]);
                            int c = (col + neighbors[j]);

                            if ((r < rows && r >= 0) && (c < cols && c >= 0) && (Math.abs(board[r][c]) == 1)) 
                            {
                                liveNeighbors += 1;
                            }
                        }
                    }
                }

             
                if ((board[row][col] == 1) && (liveNeighbors < 2 || liveNeighbors > 3)) 
                {
                    board[row][col] = -1; //the cell is now dead but originally was live.
                }
        
                if (board[row][col] == 0 && liveNeighbors == 3) 
                {
                    board[row][col] = 2; //the cell is now live but was originally dead.
                }
            }
        }

        for (int row = 0; row < rows; row++) 
        {
            for (int col = 0; col < cols; col++) 
            {
                if (board[row][col] > 0) 
                {
                    board[row][col] = 1;
                } 
                else 
                {
                    board[row][col] = 0;
                }
            }
        }
    }
}
