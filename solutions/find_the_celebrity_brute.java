public class Solution extends Relation
{
    
    private int numberOfPeople;
    
    public int findCelebrity(int n)
    {
        numberOfPeople = n;
        for (int i = 0; i < n; i++)
        {
            if (isCelebrity(i))
            {
                return i;
            }
        }
        return -1;
    }
    
    private boolean isCelebrity(int i)
    {
        for (int j = 0; j < numberOfPeople; j++) 
        {
            if (i == j) continue; // Don't ask if they know themselves.
            if (knows(i, j) || !knows(j, i))
            {
                return false;
            }
        }
        return true;
    }
}
