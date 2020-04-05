class Solution 
{
    public int strStr(String haystack, String needle)
    {
        int n = haystack.length();
        int l = needle.length();
        
        for(int start = 0; start < n-l+1; start++)
        {
            if(haystack.substring(start, start+l).equals(needle))
            {
                return start;
            }
        }
        
        return -1;
    }
}
