class Solution {
    public int digitSqSum(int n){
        int sum=0;
        while(n!=0){
            sum+= (n%10)*(n%10);
            n /=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow,fast;
        slow=fast=n;
        do{
            slow = digitSqSum(slow);
            fast = digitSqSum(fast);
            fast = digitSqSum(fast);
        }
        while(slow!=fast);
        if(slow==1) return true;
        return false;
        
    }
}