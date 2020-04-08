class Powers
{
    int n = 15;
    public List<Integer> nums = new ArrayList<>();
    Powers()
    {
        int lastNum = 1;
        nums.add(lastNum);
        for(int i=1; i<n+1; i++)
        {
            lastNum = lastNum * 4;
            nums.add(lastNum);
        }
    }
}

class Solution
{
    public static Powers p = new Powers();
    public boolean isPowerOfFour(int num)
    {
        return p.nums.contains(num);        
    }
}
