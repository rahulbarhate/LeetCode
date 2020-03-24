class Solution 
{
    public int findDuplicate(int[] nums)
    {
        int fast = nums[0];
        int slow = nums[0];
        
        do
        {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);
        
        
        int ptr1 = nums[0];
        int ptr2 = slow;
        
        while(ptr1 != ptr2)
        {
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }
        
        return ptr1;
    }
}
