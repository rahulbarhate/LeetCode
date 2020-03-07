class Solution
{
    int[] dr = new int[] {0, 0 , 1, -1};
    int[] dc = new int[] {-1, 1, 0, 0};
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        int R = image.length;
        int C = image[0].length;
        
        int oldColor = image[sr][sc];
        if (oldColor == newColor)
            return image;
        Queue<Point> q = new ArrayDeque<Point>();
        q.add(new Point(sr, sc));
        
        while(!q.isEmpty())
        {
        
            Point p = q.poll();
            image[p.x][p.y] = newColor;
            
            for (int i = 0; i < 4; i++)
            {
                int x = p.x + dr[i];
                int y = p.y + dc[i];
                
                if (isValid(image, oldColor, x, y, R, C))
                {
                    q.add(new Point(x, y));
                }
                
            }
        }
        
        return image;
    }
    
    
     private boolean isValid(int[][] image, int oldColor, int x, int y, int R, int C)
     {
            if (x >= 0 && x < R && y >= 0 && y < C && image[x][y] == oldColor)
                return true;
         return false;
     }
    
    class Point
    {
        int x;
        int y;
        
        public Point(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
        
    }
}
