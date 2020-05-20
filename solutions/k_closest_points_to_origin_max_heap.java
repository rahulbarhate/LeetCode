class Solution 
{
    public int[][] kClosest(int[][] points, int K)
    {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<int[]>((a, b) -> (b[0] * b[0] + b[1] *b[1]) - (a[0] * a[0] + a[1] * a[1]));
        for(int[] point: points)
        {
            maxHeap.offer(point);
            if(maxHeap.size() > K)
            {
                maxHeap.poll();
            }
        }
        
        int[][] result = new int[K][2];
        while(K > 0)
        {
            result[--K] = maxHeap.poll();    
        }
        
        return result;
    }
}
