class Solution
{
    Map<String, String> phone = new HashMap<String, String>(){{
            put("2", "abc");
            put("3", "def");
            put("4", "ghi");
            put("5", "jkl");
            put("6", "mno");
            put("7", "pqrs");
            put("8", "tuv");
            put("9", "wxyz");
    }};
        
    List<String> result = new ArrayList<String>();
    
    public void backtrack(String combination,  String next_digits)
    {
        if(next_digits.length() == 0)
        {
            result.add(combination);
        }
        else
        {
            String digit = next_digits.substring(0,1);
            String letters = phone.get(digit);
            
            for(int i=0; i<letters.length(); i++)
            {
                String letter = phone.get(digit).substring(i, i+1);
                backtrack(combination + letter, next_digits.substring(1));
            }
        }
        
    }
    
    public List<String> letterCombinations(String digits)
    {
        if(digits.length() != 0)
        {
            backtrack("", digits);
        }
        
        return result;
    }
}
