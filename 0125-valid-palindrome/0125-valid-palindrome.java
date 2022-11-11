class Solution {
    public boolean isPalindrome(String s) {

        
        s= s.toLowerCase();
        if(s.length()<2) return true;
        String str1="";
        String str2="";
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if( (97<=c && c<=122) || (48<=c && c<=57) ){
                str1+=c;
                str2=c+str2;
                
            }
              
             
        }
        
        return str1.equals(str2);
        
    }
}