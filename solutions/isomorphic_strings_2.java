class Solution 
{
    static int size = 256;
    public boolean isIsomorphic(String s1, String s2) 
    {
        int len1 = s1.length(); 
        int len2 = s2.length(); 
         
        if(len1 != len2) 
            return false; 
              
        // To mark visited characters in s2 
        Boolean[] marked = new Boolean[size]; 
        Arrays.fill(marked, Boolean.FALSE); 
          
        // To store mapping of every character from s1 to 
        // that of s2. Initialize all entries of map as -1. 
        int[] map = new int[size]; 
        Arrays.fill(map, -1); 
          
        // Process all characters one by one 
        for (int i = 0; i < len1; i++) 
        { 
            // If current character of s1 is seen first 
            // time in it. 
            if (map[s1.charAt(i)] == -1) 
            { 
                // If current character of s2 is already 
                // seen, one to one mapping not possible 
                if (marked[s2.charAt(i)] == true) 
                    return false; 
  
                // Mark current character of s2 as visited 
                marked[s2.charAt(i)] = true; 
  
                // Store mapping of current characters 
                map[s1.charAt(i)] = s2.charAt(i); 
            } 
  
            // If this is not first appearance of current 
            // character in s1, then check if previous 
            // appearance mapped to same character of s2 
            else if (map[s1.charAt(i)] != s2.charAt(i)) 
            return false; 
        } 
  
        return true; 
    }
}
