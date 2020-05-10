class Solution
{
    public int findNumbers(int[] nums) 
    {
        return (int) Arrays.stream(nums)
                     .map(e -> String.valueOf(e).length())
                     .filter(e -> e%2 == 0)
                     .count();
    }
}
