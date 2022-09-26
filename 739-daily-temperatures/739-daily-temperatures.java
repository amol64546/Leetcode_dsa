class Solution {
    public int[] dailyTemperatures(int[] arr) {
        
        int n = arr.length;
           
          int[] ans = new int[n];
          
            int st=0;    // ptr
           for(int i=0; i<n-1; i++){   // forward
                if(arr[i]<arr[i+1])
                    ans[i] = 1;    // adjacent
                 else{
                      st = i+1;  // from next to adjacent
                       while(st<=n-1){   // upto last ele
                            if(arr[i]<arr[st]){
                                  ans[i] = st - i;   // distance
                                   break;
                              }
                             st++;
                        }
                 }
         }
                
         return ans;
    }
}