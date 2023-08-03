class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = left;i<=right;i++){
            if(check(i)){
                list.add(i);
            }
        }
        return list;
        
    }
    public static boolean check(int i){
        int a = i;
        while(i> 0){
           int c = i%10;
           if(c == 0 ||a%c!=0){
               return false;
           } 
           i = i/10;
        }
        return true;
    }
}
