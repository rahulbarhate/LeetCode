// Sliding Window Optimized Solution No: 3
// From: LeetCode official solution - under comment

class Solution
{
    public int lengthOfLongestSubstring(String s) 
    {
        int j=0, max=0;
        Map<Character, Integer> map = new HashMap<>();
        
        
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(map.containsKey(c))
            {
                if(map.get(c) >= j)
                    j = map.get(c) + 1;
            }
            
            max = Math.max(max, i-j+1);
            map.put(c, i);
        }
        
        return max;
        
    }
};
