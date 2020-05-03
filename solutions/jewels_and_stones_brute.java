class Solution
{
    public int numJewelsInStones(String J, String S)
    {
        int result = 0;
        for(char s : S.toCharArray())
        {
            for(char j : J.toCharArray())
            {
                if(j == s)
                {
                    result++;
                    break;
                }
            }
        }
        
        return result;
    }
}
