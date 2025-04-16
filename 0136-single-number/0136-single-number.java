class Solution {
    public int singleNumber(int[] nums) {
        int l=nums.length;
        int a=0;
        
        for(int i=0;i<l;i++)
        {
            a=a^ nums[i];
        }
        return a;
    }
}