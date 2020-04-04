class Solution 
{
    public String removeDuplicates(String S) 
    {
        StringBuilder sb = new StringBuilder();
        int sbLength = 0;
        for(char c : S.toCharArray())
        {
            if(sbLength != 0 && c == sb.charAt(sbLength - 1))
            {
                sb.deleteCharAt(sbLength - 1);
                sbLength--;
            }
            else
            {
                sb.append(c);
                sbLength++;
            }
        }
        
        return sb.toString();
    }
}
