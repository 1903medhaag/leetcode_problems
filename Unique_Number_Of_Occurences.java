class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int a: arr){
            if(map.containsKey(a)){
                int x = map.get(a);
                map.put(a,x+1);
            }
            else{
                map.put(a,1);
            }
        }
        Set<Integer> set = new HashSet<Integer>();
        for(int b:arr){
            set.add(map.get(b));
        }
        if(set.size() == map.size()) return true;

        return false;
        
    }
}
