class Solution
{
    public int[] char_map;
    public boolean isAlienSorted(String[] words, String order)
    {
        char_map = new int[26];
        for(int i=0; i<order.length();i++)
            char_map[order.charAt(i) - 'a'] = i;
        
        for(int i=1; i<words.length; i++)
        {
            if(compare(words[i-1], words[i]) > 0)
            {
                return false;
            }
        }
        
        return true;
    }
    
    
    public int compare(String word1, String word2)
    {
        int i=0;
        int j = 0;
        int char_compare_val = 0;
        
        while(i < word1.length() && j < word2.length() && char_compare_val == 0)
        {
            char_compare_val = char_map[word1.charAt(i) - 'a'] - char_map[word2.charAt(i) - 'a'];
            i++; j++;
        }
        
        if(char_compare_val == 0)
        {
            return word1.length() - word2.length();
        }
        else
        {
            return char_compare_val;
        }
    }
}

    
