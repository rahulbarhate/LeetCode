class Solution
{
  public int[] intersection(int[] nums1, int[] nums2)
  {
      Arrays.sort(nums1);
      Arrays.sort(nums2);
      int i=0, j=0, k=0; 
      
      while(i<nums1.length && j<nums2.length)
      {
            int val1 = nums1[i];
            int val2 = nums2[j];
            
            if(val1 < val2)
            {
                while(i < nums1.length && val1 == nums1[i])
                    i++;
            }
            else if(val1 > val2)
            {
                while(j < nums2.length && val2 == nums2[j])
                    j++;
            }
            else
            {
                nums1[k] = nums1[i];
                k++; 
                while (i<nums1.length && val1 == nums1[i])
                    i++;
                while (j<nums2.length && val2 == nums2[j])
                    j++;
            }
        }
        
        return Arrays.copyOf(nums1, k);
  }
}
