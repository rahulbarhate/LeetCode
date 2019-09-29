class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2)
    {
        unordered_map<int,int>hmap1;
        unordered_map<int, int>hmap2;
        
        vector<int> result;
        
        if(nums1.size() == 0 || nums2.size() ==0)
        {
            return result;
        }
        
        for(int i=0; i<nums1.size(); i++)
        {
            hmap1[nums1[i]]++;
        }
        
        for(int i=0; i<nums2.size(); i++)
        {
            hmap2[nums2[i]]++;
            if(hmap1[nums2[i]]>0)
            {
                hmap1[nums2[i]] = 0;
                result.push_back(nums2[i]);
            }
        }
        
        return result;
    }
};