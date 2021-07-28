class Solution 
{
    public boolean isNumber(String s)
    {
        boolean seenDigit = false;
        boolean seenExponent = false;
        boolean seenDot = false;
        
        for(int i=0; i<s.length(); i++)
        {
            char curr = s.charAt(i);
            if(Character.isDigit(curr))
                seenDigit = true;
            
            else if (curr == '+' || curr == '-')
            {
                if(i > 0 && s.charAt(i-1) != 'e' && s.charAt(i-1) != 'E')
                {
                    return false;
                }
            }
            
            else if(curr == 'e' || curr == 'E')
            {
                if(seenExponent || !seenDigit)
                {
                    return false;
                }
                seenExponent = true;
                seenDigit = false;
            }
            
            else if(curr == '.')
            {
                if(seenDot || seenExponent)
                {
                    return false;
                }
                seenDot = true;
            }
            
            else
            {
                return false;
            }
        }
        return seenDigit;
    }
}
