class Solution {
    public void moveZeroes(int[] nums) {
        int temp;
        int c =0;
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                temp = nums[c];
                nums[c]=nums[i];
                nums[i]=temp;
                c++;
                }
        }
    
        
    }
}
