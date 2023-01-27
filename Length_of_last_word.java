class Solution {
    public int lengthOfLastWord(String s) {
        String s2 = s.trim();
        int length = 0;
        for(int i = 0;i<=s2.length()-1;i++)
        {
            if(s2.charAt(i) ==' '){
                length = 0;
            }
            else {
                length++;
            }
        }
        return length;
    }
}
