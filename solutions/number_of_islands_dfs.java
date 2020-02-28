/*

Intuition

Treat the 2d grid map as an undirected graph and there is an edge between two horizontally or vertically adjacent nodes of value '1'.

Algorithm

Linear scan the 2d grid map, if a node contains a '1', then it is a root node that triggers a Depth First Search.
During DFS, every visited node should be set as '0' to mark as visited node. 
Count the number of root nodes that trigger DFS, this number would be the number of islands since each DFS starting
at some root identifies an island.


*/

class Solution 
{
    public void dfs(char[][] grid, int r, int c)
    {
        int nr = grid.length;
        int nc = grid[0].length;
        
        if(r<0 || c<0 || r>=nr || c>=nc || grid[r][c] =='0')
        {
            return;
        }
        
        grid[r][c] = '0';
        dfs(grid, r, c-1);
        dfs(grid, r-1, c);
        dfs(grid, r+1, c);
        dfs(grid, r, c+1);
   
    }   

    public int numIslands(char[][] grid)
    {
        if(grid == null || grid.length == 0)
        {
            return 0;
        }
        
        int numofIslands = 0;
        int nr = grid.length;
        int nc = grid[0].length;
        
        for(int i=0; i<nr; i++)
        {
            for(int j=0; j<nc; j++)
            {
                if(grid[i][j] == '1')
                {
                    numofIslands++;
                    dfs(grid, i, j);
                }
            }
        }
    
        return numofIslands;
    }
}

/*

Complexity Analysis

Time complexity : O(M x N)O(M×N) where MM is the number of rows and NN is the number of columns.

Space complexity : worst case O(M x N) in case that the grid map is filled with lands where DFS goes
by M x N deep.

*/
