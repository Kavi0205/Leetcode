class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        int n=1;
        if(num<0){
            return false;
        }
       for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
       }
       return sum==num;
    }
}