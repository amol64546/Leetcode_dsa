class Solution {
    public String addStrings(String num1, String num2) {
        String ans = "";
        int i=num1.length()-1, j=num2.length()-1;
        int sum=0, carry=0;
        while(i>=0 || j>=0){
            sum = carry;
            if(i>=0){
               sum += num1.charAt(i--)-'0';  
            }
            if(j>=0){
               sum += num2.charAt(j--)-'0';  
            }
            ans = (sum%10) + ans;
            carry = sum/10;   
            
        }
        if(carry!=0) ans = carry + ans;
        return ans;
    }
}