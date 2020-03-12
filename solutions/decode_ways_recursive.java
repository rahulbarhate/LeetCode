/* 

Time Complexity: O(N), where NN is length of the string. Memoization helps in pruning the recursion tree and 
hence decoding for an index only once. Thus this solution is linear time complexity.

Space Complexity: O(N). The dictionary used for memoization would take the space equal to the length of the string.
There would be an entry for each index value. The recursion stack would also be equal to the length of the string.

*/

class Solution
{
    HashMap<Integer, Integer> memo = new HashMap<>();
    
    private int recursiveWithMemo(int index, String s)
    {
         // If you reach the end of the string
        // Return 1 for success.
        if(index == s.length())
        {
            return 1;
        }
        
        
         // If the string starts with a zero, it can't be decoded
        if(s.charAt(index) == '0')
        {
            return 0;
        }
        
        if(index == s.length()-1)
        {
            return 1;
        }
        
        if(memo.containsKey(index))
        {
            return memo.get(index);
        }
        
        int ans = recursiveWithMemo(index+1, s);
        if(Integer.parseInt(s.substring(index, index+2)) <= 26)
        {
            ans += recursiveWithMemo(index+2, s);
        }
        
        memo.put(index, ans);
        
        return ans;
    }
    
    public int numDecodings(String s)
    {
        if(s == null || s.length() ==0)
        {
            return 0;
        }
        
        
        return recursiveWithMemo(0,s);
    }
    
    
}
