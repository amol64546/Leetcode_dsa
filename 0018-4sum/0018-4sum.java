class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
       int n = arr.length;        
      
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        
       
       
         for(int i=0; i<n-1; ++i){
             if(i>0 && arr[i]==arr[i-1]) continue;
            for(int j=i+1; j<n; ++j){
                if(j>i+1 && arr[j]==arr[j-1]) continue;
                
                int l=j+1, r=n-1;
                while(l<r){
                    long sum = arr[i]+arr[j];
                     long val = ((long)target - sum);
                    
                    if(arr[l]+arr[r]<val){
                        l++;
                    }else if(arr[l]+arr[r]>val){
                        r--;
                    }else{                                               
                        ans.add(Arrays.asList(arr[i],arr[j],arr[l],arr[r]));
                        while(l<r && arr[l]==arr[l+1])
                            l++;
                        while(l<r && arr[r]==arr[r-1])
                             r--;
                        l++;
                        r--;
                    }
                }
               
            }
            
             
         }
        
        
        return  ans;
    }
      
}