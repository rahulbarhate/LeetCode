class Solution {
public:
    void sortColors(vector<int>& nums)
    {
        int n = nums.size();
        
        int n0 = 0, n1 = 0, n2 = 0;
        int i;
        
        for(i=0; i<n; i++)
        {
            if(nums[i] == 0)
                n0++;
            else if(nums[i] == 1)
                n1++;
            else
                n2++;
        }
        
        for(i=0; i<n0; i++)
            nums[i] = 0;
        
        for(i=n0; i<n0+n1; i++)
            nums[i] = 1;
        
        for(i=n0+n1; i<n; i++)
            nums[i] = 2;
    
    }
};