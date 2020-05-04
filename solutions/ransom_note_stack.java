class Solution
{
    private Stack<Character> sortedCharacterStack(String s)
    {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        Stack<Character> stack = new Stack();
        
        for(int i = s.length() - 1; i >= 0; i--)
        {
            stack.push(charArray[i]);
        }
        return stack;
    }
    
    public boolean canConstruct(String ransomNote, String magazine)
    {
        if(ransomNote.length() > magazine.length())
        {
            return false;
        }
        
        Stack<Character> magazineStack = sortedCharacterStack(magazine);
        Stack<Character> ransomNoteStack = sortedCharacterStack(ransomNote);
        
        while(!magazineStack.isEmpty() && !ransomNoteStack.isEmpty())
        {
            if(magazineStack.peek().equals(ransomNoteStack.peek()))
            {
                ransomNoteStack.pop();
                magazineStack.pop();
            }
            
            else if(magazineStack.peek() < ransomNoteStack.peek())
            {
                magazineStack.pop();
            }
            
            else
                return false;
        }
        
        return ransomNoteStack.isEmpty();
    }
}
