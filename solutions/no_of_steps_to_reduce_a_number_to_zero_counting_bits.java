class Solution
{
    public int numberOfSteps (int num) 
    {
        String binaryString = Integer.toBinaryString(num);
        int steps = 0;
        
        for(char bits: binaryString.toCharArray())
        {
            if(bits == '1')
            {
                steps += 2;
            }
            else
            {
                steps += 1;
            }
        }
        
        return steps-1;
    }
}
