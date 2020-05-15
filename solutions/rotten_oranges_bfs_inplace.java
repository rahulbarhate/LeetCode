class Solution
{
  public boolean runRottingProcess(int timestamp, int[][] grid, int ROWS, int COLS)
  {
    int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    // flag to indicate if the rotting process should be continued
    boolean toBeContinued = false;
      
    for (int row = 0; row < ROWS; ++row)
    {
      for (int col = 0; col < COLS; ++col)
      {
        if (grid[row][col] == timestamp)
        {
          for (int[] d : directions)
          {
            int nRow = row + d[0], nCol = col + d[1];
            if (nRow >= 0 && nRow < ROWS && nCol >= 0 && nCol < COLS )
            {
              if (grid[nRow][nCol] == 1)
              {
                grid[nRow][nCol] = timestamp + 1;
                toBeContinued = true;
              }
            }
          }
        }
      }
    }
    return toBeContinued;
  }

  public int orangesRotting(int[][] grid)
  {
    int ROWS = grid.length, COLS =  grid[0].length;
    int timestamp = 2;
      
    while (runRottingProcess(timestamp, grid, ROWS, COLS))
        timestamp++;

    // end of process, to check if there are still fresh oranges left
    for (int[] row : grid)
    {
      for (int cell : row)
      {
        if (cell == 1) return -1;
      }
    }

    return timestamp - 2;
  }
}
