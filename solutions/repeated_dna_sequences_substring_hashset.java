class Solution 
{
    public List<String> findRepeatedDnaSequences(String s) 
    {
        int l = 10, n = s.length();
        HashSet<String> seen = new HashSet(), output = new HashSet();
        
        for(int start = 0; start < n-l+1; start++)
        {
            String temp = s.substring(start, start+l);
            if(seen.contains(temp))
                output.add(temp);
            seen.add(temp);
        }
        
        return new ArrayList<String>(output);
    }
}
