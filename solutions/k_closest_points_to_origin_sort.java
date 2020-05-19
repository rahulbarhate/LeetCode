class Solution 
{
    public int[][] kClosest(int[][] points, int K)
    {
        int n = points.length;
        int[] distances = new int[n];
        
        for(int i=0; i<n; i++)
        {
            distances[i] = computeDistances(points[i]);
        }
        
        Arrays.sort(distances);
        
        int counter = 0;
        int distanceK = distances[K-1];
        int[][] result = new int[K][2];
        
        for(int i=0; i<n; i++)
        {
            if(computeDistances(points[i]) <= distanceK)
            {
                result[counter++] = points[i];
            }
        }
        
        return result;
    }
        
        
    private int computeDistances(int[] points)
    {
        return points[0] * points[0] + points[1] * points[1];
    }
}
