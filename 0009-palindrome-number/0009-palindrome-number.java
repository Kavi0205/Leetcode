class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        int reversed=0;
        if(x<0){
            return false;
        }
        while(x!=0){
            int n=x%10;
            reversed = reversed*10+n;
            x/=10;
        }    
        if(original==reversed){
            return true;
        }
        return false;
    }
}