class Solution
{
    public char findTheDifference(String s, String t) 
    {
        char[] sortedS = s.toCharArray();
        char[] sortedT = t.toCharArray();
        
        Arrays.sort(sortedS);
        Arrays.sort(sortedT);
        
        int i = 0;
        while(i < s.length())
        {
            if(sortedS[i] != sortedT[i])
            {
                return sortedT[i];
            }
            
            i+=1;
        }
        
        return sortedT[i];
    }
}
