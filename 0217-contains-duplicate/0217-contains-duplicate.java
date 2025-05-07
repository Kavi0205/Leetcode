class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for(int a:nums){
            if(s.contains(a)){
                return true;
            }
            s.add(a);
        }
        return false;
    }
}