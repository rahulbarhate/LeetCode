class Solution
{
    public String mostCommonWord(String paragraph, String[] banned)
    {
        HashSet<String> bannedWords = new HashSet<>();
        for(String word: banned)
            bannedWords.add(word);
        
        HashMap<String, Integer> counts = new HashMap<>();
        for(String word:paragraph.replaceAll("\\W+" , " ").toLowerCase().split("\\s+"))
        {
            if(!bannedWords.contains(word))
            {
                counts.put(word, counts.getOrDefault(word, 0) + 1);
            }
        }
        
        String result = "";
        for(String key: counts.keySet())
        {
            if(result.equals("") || counts.get(key) > counts.get(result))
            {
                result = key;
            }
        }
        
        return result;
    }
}
