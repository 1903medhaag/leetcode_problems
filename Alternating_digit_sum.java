class Solution {
    public int alternateDigitSum(int n) {
         n = func(n);
        int e = 0;
        int o = 0;
        int c =1;
        int s;
       
        while(n>0){
            s = n%10;
            if(c%2==0){
                e = e + s;
            }
            else
            {
                o = o+s;
            }
            n = n/10;
            c++;
        }
     
        return o - e;
        
    }
    public int func(int n)
    {
        int a = 0;
        while(n>0)
        {
            int b = n%10;
            a = a*10+b;
        
            n = n/10;
        }
        return a;
    }
}
