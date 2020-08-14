class Solution
{
    public int lengthOfLastWord(String s) 
    {
        int endOfString = s.length(), length = 0;
        while(endOfString > 0)
        {
            endOfString--;
            if(s.charAt(endOfString) != ' ')
            {
                length++;
            }
            
            else if (length > 0)
            {
                return length;
            }
        }
        return length;
    }
}
