class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int[] nums = new int[n*n];
        for(int i=0;i<nums.length;i++){
            nums[i] = i+1;
        }
        int minc=0, maxc = n-1, minr =0, maxr = n-1;
        int a =0;
        while(minc <= maxc && minr <= maxr)
        {
            for(int i=minc;i<=maxc;i++){
                res[minr][i] = nums[a];
                a++;
            }
            minr++;
            for(int i=minr; i<=maxr ;i++){
                res[i][maxc] = nums[a];
                a++;
            }
            maxc--;
            if(minc <= maxc && minr <= maxr)
            {
                for(int i=maxc ; i>= minc; i--){
                    res[maxr][i] = nums[a];
                    a++;
                }
                maxr--;
                for(int i = maxr;i>=minr;i--){
                    res[i][minc] = nums[a];
                    a++;
                }
                minc++;
            }
        }
        return res;
    }
}
