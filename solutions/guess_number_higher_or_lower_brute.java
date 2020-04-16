/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame 
{
    public int guessNumber(int n) 
    {
        for(int i=1; i<n; i++)
        {
            if(guess(i) == 0)
                return i;
        }
        
        return n;
    }
}
