class Solution
{
    public int lengthOfLastWord(String s) 
    {
        int endOfString = s.length() - 1;
        while(endOfString >= 0 && s.charAt(endOfString) == ' ')
        {
            endOfString--;
        }
        
        int length = 0;
        while(endOfString >= 0 && s.charAt(endOfString) != ' ')
        {
            endOfString--;
            length++;
        }
        
        return length;
    }
}
