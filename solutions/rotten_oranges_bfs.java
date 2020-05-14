class Solution
{
    public int orangesRotting(int[][] grid)
    {
        Queue<Pair<Integer, Integer>> queue = new ArrayDeque();
        
        int freshOranges = 0;
        int rows = grid.length, cols = grid[0].length;
        
        for(int r = 0; r < rows; r++)
        {
            for(int c = 0; c < cols; c++)
            {
                if(grid[r][c] == 1)
                    freshOranges++;
                
                else if(grid[r][c] == 2)
                    queue.offer(new Pair(r, c));
            }
        }
        
        queue.offer(new Pair(-1, -1));
        
        int minutes = -1;
        int [][] directions = {{0,1}, {1,0}, {0, -1}, {-1, 0}};
        while(!queue.isEmpty())
        {
            Pair<Integer, Integer> p = queue.poll();
            int row = p.getKey();
            int col = p.getValue();
            
            if(row == -1)
            {
                minutes ++;
                if(!queue.isEmpty())
                {
                    queue.offer(new Pair(-1,-1));
                }
            }
            
            else
            {
                for(int[] d : directions)
                {
                    int neighborRow = row + d[0];
                    int neighborCol = col + d[1];
                    if(neighborRow >= 0 && neighborCol >= 0 && neighborRow < rows && neighborCol < cols)
                    {
                        if(grid[neighborRow][neighborCol] == 1)
                        {
                            grid[neighborRow][neighborCol] = 2;
                            freshOranges--;
                            
                            queue.offer(new Pair(neighborRow, neighborCol));
                        }
                    }
                }
            }
            
            
        }
        
        return freshOranges == 0 ? minutes : -1;
    }
}
