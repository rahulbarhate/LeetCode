class NumArray
{

    private int data[];
    
    public NumArray(int[] nums)
    {
        data = nums;
    }
    
    public int sumRange(int i, int j)
    {
        int sum = 0;
        for(int k = i; i<=j; i++)
        {
            sum += data[i];
        }
        
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
