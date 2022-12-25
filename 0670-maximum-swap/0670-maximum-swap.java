class Solution {
    public int maximumSwap(int num) {
        
        
        char[] digits = (""+num).toCharArray();
        
        int n = digits.length;
        
        int[] rightMax = new int[n];
        rightMax[n-1] = n-1;
        int maxIndex = n-1;
            
        for(int i=n-2; i>=0; i--){
            if(digits[i]>digits[maxIndex]){
                maxIndex = i;               
            }
             rightMax[i] = maxIndex;
        }
        
        for(int i=0; i<n; i++){
            if(digits[i]<digits[rightMax[i]]){
                //swap
                char temp = digits[rightMax[i]];
                digits[rightMax[i]] = digits[i];
                digits[i] = temp;
                break;
            }
        }
        return Integer.parseInt(String.valueOf(digits));
    }
}