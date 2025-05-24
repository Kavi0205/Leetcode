class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        int n=1;
        if(num<0){
            return false;
        }
        while(n<=num/2){
            if(num%n==0){
                sum+=n;
            }
            n++;
        }
        if(sum==num){
            return true;
        }
        return false;
    }
}