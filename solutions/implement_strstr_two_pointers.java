class Solution 
{
    public int strStr(String haystack, String needle)
    {
        int n = haystack.length();
        int l = needle.length();
        
        if(l == 0)
            return 0;
        
        int ptr = 0;
        while(ptr < n-l+1)
        {
            while(ptr < n-l+1 && haystack.charAt(ptr) != needle.charAt(0))
            {
                ptr++;
            }
            
            int currLen = 0;
            int p_needle = 0;
            
            while(p_needle < l && ptr < n && haystack.charAt(ptr) == needle.charAt(p_needle))
            {
                ptr++; p_needle++; currLen++;
            }
            
            if (currLen == l)
                return ptr - l;
            
            ptr = ptr - currLen + 1;
        }
        
        return -1;
    }
}
