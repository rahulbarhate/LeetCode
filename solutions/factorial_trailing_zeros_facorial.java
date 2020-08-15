import java.math.BigInteger;

class Solution
{
    public int trailingZeroes(int n)
    {
        BigInteger nFactorial = BigInteger.ONE;
        for(int i = 2; i <= n; i++)
        {
            nFactorial = nFactorial.multiply(BigInteger.valueOf(i));
        }
        
        int nZeros = 0;
        
        while(nFactorial.mod(BigInteger.TEN).equals(BigInteger.ZERO))
        {
            nFactorial = nFactorial.divide(BigInteger.TEN);
            nZeros++;
        }
        
        return nZeros;
    }
}
