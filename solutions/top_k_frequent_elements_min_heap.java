class Solution
{
    public int[] topKFrequent(int[] nums, int k)
    {
        HashMap<Integer, Integer> count = new HashMap();
        for(int n : nums)
        {
            count.put(n, count.getOrDefault(n, 0)+1);
        }
        
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>((n1, n2) -> count.get(n1) - count.get(n2));
        
        for(int n : count.keySet())
        {
            heap.add(n);
            if(heap.size() > k)
            {
                heap.poll();
            }
        }
        
        int[] top_k = new int[k];
                
        for(int i=0; i<k; i++)
        {
            top_k[i] = heap.poll();
        }
        
        return top_k;
    }
}
