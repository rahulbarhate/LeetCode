public class solution{
    public static int numOfTowers(int[] nums, int range){
        int numOfTowers = 0;
        int i = 0;

        while(i < nums.length){
            numOfTowers++;
            int loc = nums[i] + range;
            while(i < n && house[i] <= loc){
                i++;
            }

            i--;

            loc = nums[i] + range;
            while(i < n && house[i] <= loc){
                i++;
            }
        }

        return numOfTowers;
    }
}
