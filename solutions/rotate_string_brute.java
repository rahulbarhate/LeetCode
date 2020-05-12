class Solution
{
    public boolean rotateString(String A, String B)
    {
        if(A.length() != B.length())
            return false;
        
        if(A.length()==0)
            return true;
        
        search:
        for(int i = 0; i < A.length(); i++)
        {
            for(int j = 0; j < A.length(); j++)
            {
                if(A.charAt((i+j) % A.length()) != B.charAt(j))
                    continue search;
            }
            
            return true;
        }
        
        return false;
    }
}
