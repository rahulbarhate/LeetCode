class Solution
{
    public List<List<String>> groupAnagrams(String[] strs)
    {
        if(strs.length == 0)
            return new ArrayList();
        
        Map<String, List> result = new HashMap<String, List>();
        int[] count = new int[26];
        
        for(String s : strs)
        {
            Arrays.fill(count, 0);
            for(char c : s.toCharArray())
            {
                count[c - 'a']++;
            }
            
            StringBuilder sb = new StringBuilder("");
            for(int i=0; i<26; i++)
            {
                sb.append('#');
                sb.append(count[i]);
            }
                                                 
            String key = sb.toString();
            if(!result.containsKey(key))
            {
                result.put(key, new ArrayList());
            }
            
            result.get(key).add(s);
                                                 
        }
        
        return new ArrayList(result.values());
    }
}
