class Solution
{
    private Map<Character, Integer> makeCountsMap(String s)
    {
        Map<Character, Integer> counts = new HashMap();
        for(char c : s.toCharArray())
        {
            counts.put(c, counts.getOrDefault(c,0) + 1);
        }
        return counts;
    }
    
    public boolean canConstruct(String ransomNote, String magazine)
    {
        if(ransomNote.length() > magazine.length())
        {
            return false;
        }
        
        Map<Character, Integer> magazineCounts = makeCountsMap(magazine);
        
        for(char c : ransomNote.toCharArray())
        {
            int countMagazine = magazineCounts.getOrDefault(c, 0);
            if(countMagazine == 0)
            {
                return false;
            }
            
            magazineCounts.put(c, countMagazine - 1);
        }
        
        return true;
    }
}
