class Solution
{
    public List<List<String>> groupAnagrams(String[] strs)
    {
        if(strs.length == 0)
            return new ArrayList();
        
        Map<String, List> result = new HashMap<String, List>();
        for(String s : strs)
        {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            
            if(!result.containsKey(key))
                result.put(key, new ArrayList());
            
            result.get(key).add(s);
        }
        
        return new ArrayList(result.values());
    }
}
