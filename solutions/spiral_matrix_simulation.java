class Solution
{
    public List<Integer> spiralOrder(int[][] matrix)
    {
        List result = new ArrayList<>();
        
        if(matrix.length == 0)
            return result;
        
        int R = matrix.length, C = matrix[0].length;
        
        boolean[][] seen = new boolean[R][C];
        
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        
        int r = 0, c = 0, di = 0;
        for(int i = 0; i < R*C; i++)
        {
            result.add(matrix[r][c]);
            seen[r][c] = true;
            int cr = r + dr[di];
            int cc = c + dc[di];
            
            
            if(0 <= cr && cr < R && 0 <= cc && cc < C && !seen[cr][cc])
            {
                r = cr;
                c = cc;
            }
            
            else
            {
                di = (di + 1) % 4;
                r += dr[di];
                c += dc[di];
            }
        }
        
        return result;
    }
}
