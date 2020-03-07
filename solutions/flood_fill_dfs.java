class Solution
{
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) 
    {
        if(image[sr][sc] == newColor)
            return image;
        
        floodFill(image, sr, sc, image[sr][sc], newColor);
        return image;
    }
    
    public void floodFill(int[][] image, int i, int j, int existingColor, int newColor)
    {
        if(i < 0 || i >= image.length || j < 0 || j >= image[i].length || image[i][j] != existingColor)
        {
            return;
        }
        
        image[i][j] = newColor;
        floodFill(image, i+1, j, existingColor, newColor);
        floodFill(image, i-1, j, existingColor, newColor);
        floodFill(image, i, j+1, existingColor, newColor);
        floodFill(image, i, j-1, existingColor, newColor);
    }
}
