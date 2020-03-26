class Solution 
{
    public String reverseWords(String s)
    {
        // for reoving the leading spaces - https://www.geeksforgeeks.org/java-string-trim-method-example/
         s = s.trim();
        
        //Split the string by multiple spaces
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }
}
