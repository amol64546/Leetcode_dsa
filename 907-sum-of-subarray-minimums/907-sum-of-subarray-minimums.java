class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] left = smallOnLeft(arr,n);           
        int[] right = smallOnright(arr,n);             
      
        long mod = (long) 1e9+7;        
        long ans = 0;       
        
        for(int i=0; i<n; i++){
            // total no of subarrays where current elements is smaller
           long count = (left[i]+1) * (right[i]+1);
            
            // sum of min in subarrays
            ans += (arr[i] * count);  // larger value
            ans = ans % mod;          // become smaller value             
        }         
        return (int)ans;
    }
    
       public int[]  smallOnLeft(int[] arr,int n){
           Stack<Integer> st = new Stack<>();
           int[] ans = new int[n];
           
           for(int i=0; i<n; i++){   // forward loop
               while(!st.empty() && arr[st.peek()]>=arr[i]){
                   st.pop();
               }               
               if(st.empty()){  // if we dont get any smaller element on left
                   ans[i] = i;  // count of greater on left
               }else{     // prev smaller element on left
                   ans[i] = i-st.peek()-1;  // count of greater on left
               }
               st.push(i);
           }           
           
           return ans;
       }
        
       public int[]  smallOnright(int[] arr,int n){
           Stack<Integer> st = new Stack<>();
            int[] ans = new int[n];
           
           for(int i=n-1; i>=0; i--){    // backward loop
              while(!st.empty() && arr[st.peek()]>arr[i]){
                   st.pop();
               }               
               if(st.empty()){   // if we dont get any smaller element on right
                   ans[i] = n-i-1;   // count of greater on right
               }else{  // next smaller element on right
                  ans[i]= st.peek()-i-1;  // count of greater on right
               }
               st.push(i); 
           }          
           
           return ans;
       }     
   
}