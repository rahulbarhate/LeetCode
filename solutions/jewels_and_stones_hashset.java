class Solution
{
    public int numJewelsInStones(String J, String S)
    {
        int result = 0;
        Set<Character> Jset = new HashSet();
        for(char j : J.toCharArray())
        {
            Jset.add(j);
        }
        
        for(char s : S.toCharArray())
        {
            if(Jset.contains(s))
            {
                result++;
            }
        }
        
        return result;
    }
}
