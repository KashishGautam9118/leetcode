class Solution {
    public int sumOfSquaresOfDigits(int n){
        int sum=0;
        while(n>0){
            int dig=n%10;
            sum=sum+(dig*dig);
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        while(fast!=1){
            slow=sumOfSquaresOfDigits(slow);
            fast=sumOfSquaresOfDigits(fast);
            fast=sumOfSquaresOfDigits(fast);
            if(slow==fast && slow!=1){
                return false;
            }
        }
        return true;
    }
}