class Solution {
    public int maximum69Number (int n) {
        
        if(n==6 || n==9) return 9;
        char[] arr = (""+n).toCharArray();    
      
        for(int i=0; i<arr.length; i++){
            if(arr[i]=='6'){
                arr[i]='9';                
                break;                                
            }
        }
        
        return Integer.parseInt(String.valueOf(arr));
    }
}