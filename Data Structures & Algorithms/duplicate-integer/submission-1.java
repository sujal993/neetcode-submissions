class Solution {
    public boolean hasDuplicate(int[] nums) 
    {
        boolean dup = false;
        int count = 0;
        int n = nums.length;
        for(int i =0 ; i<n ; i++)
        {
            for(int j = i+1; j<n ; j++)
            {
                if(nums[i] == nums[j])
                {
                    count++;
                }
            }
        }
        if(count >= 1)
        {
            dup = true;
        }
        return dup;
    }
}