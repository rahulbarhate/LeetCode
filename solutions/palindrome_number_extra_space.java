class Solution
{
    public boolean isPalindrome(int x)
    {
        String str = String.valueOf(x);
        int start = 0;
        int end = str.length() - 1;
        while(start < end)
        {
            if(str.charAt(start++) != str.charAt(end--)) 
                return false;
        }
        return true;
    }
}
