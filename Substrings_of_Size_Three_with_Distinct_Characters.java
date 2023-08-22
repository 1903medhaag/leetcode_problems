class Solution {
    public int countGoodSubstrings(String s) {
        ArrayList<String> list=new ArrayList<String>();
        for(int i=0;i<s.length()-2;i++){
            String a = s.substring(i,i+3);
            list.add(a);
        }
        int c =0;
        for(String check:list){
            if(good(check)== true){
                c++;
            }
        }
       return c; 
    }
    public boolean good(String str){
            if(str.charAt(0) ==str.charAt(1) || str.charAt(1)==str.charAt(2) || str.charAt(0)==str.charAt(2)){
                return false;
            }
        return true;
    }
}
