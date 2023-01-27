class Solution {
    public int countEven(int num) {
        int count = 0;
        for(int i = 1;i<=num;i++){
            if(check(i)%2==0){
                count = count+1;
            }
        }
        return count;
        
    } 
    public int check(int x)
    {
        int sum = 0;
        int dig;
        while(x>0)
        {
            dig = x%10;
            sum = sum+dig;
            x = x/10;
        }
        return sum;
    }
}
