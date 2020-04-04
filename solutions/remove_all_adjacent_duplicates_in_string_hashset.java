class Solution 
{
    public String removeDuplicates(String S) 
    {
        HashSet<String> duplicates = new HashSet<>();
        StringBuilder sb  = new StringBuilder();
        
        for(char i = 'a'; i<= 'z'; i++)
        {
            sb.setLength(0);
            sb.append(i);
            sb.append(i);
            duplicates.add(sb.toString());
        }
        
        int prevLength = -1;
        while(prevLength != S.length())
        {
            prevLength = S.length();
            for(String str: duplicates)
            {
                S = S.replace(str, "");
            }
        }
        
        return S;
    }
}
