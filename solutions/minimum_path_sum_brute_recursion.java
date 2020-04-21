class Solution
{
    public int helper(int[][] grid, int i, int j)
    {
        if(i == grid.length || j == grid[0].length)
            return Integer.MAX_VALUE;
        
        if(i == grid.length - 1 && j == grid[0].length - 1)
            return grid[i][j];
        
        return grid[i][j] + Math.min(helper(grid, i+1, j), helper(grid, i, j+1));
    }
    
    public int minPathSum(int[][] grid)
    {
        return helper(grid, 0, 0);
    }
}
