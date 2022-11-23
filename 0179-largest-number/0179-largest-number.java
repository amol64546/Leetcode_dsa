class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
      
        if(n==1) return ""+nums[0];
            
        String[] str = new String[n];
        for(int i=0; i<n; i++)
            str[i] = String.valueOf(nums[i]);
        
        Arrays.sort(str, (a,b) -> (b+a).compareTo(a+b) );
        
         if(str[0].charAt(0)=='0')
            return "0";
        
        StringBuilder sb = new StringBuilder();
       
        
        for(String s: str)
            sb.append(s);
      
        return sb.toString();
            
    }
}