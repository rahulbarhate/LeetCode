public class solution{
    public static int numOfTowers(int[] houses, int range){
        int numOfTowers = 0;
        int i = 0;
        int n = houses.length;

        while(i < n){
            numOfTowers++;
            int loc = houses[i] + range;
            while(i < n && houses[i] <= loc){
                i++;
            }

            i--;

            loc = houses[i] + range;
            while(i < n && houses[i] <= loc){
                i++;
            }
        }

        return numOfTowers;
    }
}

