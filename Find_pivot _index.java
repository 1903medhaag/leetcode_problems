class Solution {
    public int pivotIndex(int[] nums) {
        int k = 0 , l = 0; 
        for(int s : nums)
        {
            k += s;
        }
        for(int i = 0; i<nums.length;++i)
            {
                k -= nums[i];
                if(k == l)
                {
                    return i ;
                }
                l += nums[i];
            }
        return -1;              
            
        
        
    }
}
