class Solution {
    public int maximum69Number (int n) {
        
        if(n==6 || n==9) return 9;
        StringBuilder sb = new StringBuilder(""+n);    
      
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i)=='6'){
                sb.setCharAt(i,'9');                
                break;                                
            }
        }
        
        return Integer.parseInt(sb.toString());
    }
}