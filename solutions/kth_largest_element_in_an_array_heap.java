class Solution 
{
    public int findKthLargest(int[] nums, int k)
    {
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>((n1,n2) -> n1 - n2);
        
        for(int num:nums)
        {
            heap.add(num);
            if(heap.size() > k)
                heap.poll();
        }
        
        return heap.poll();
    }
}
