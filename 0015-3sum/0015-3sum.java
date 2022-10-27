class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        List ans= new ArrayList();
        
        for(int i=0; i<n-2; i++){  
            if(i>0 && arr[i]==arr[i-1]) continue;
           int j=i+1;
            int k=n-1;
            while(j<k){
                
                int target=-(arr[j]+arr[k]);
                if(arr[i]>target)
                    k--;
                else if(arr[i]<target)
                    j++;
                else{
                    
                    List l= new ArrayList(Arrays.asList(arr[i],arr[j],arr[k]));
                    ans.add(l);
                    
                    // update both till we get equal elements
                    while(j<k && arr[j]==arr[j+1])
                        j++;
                    j++;
                    while(j<k && arr[k]==arr[k-1])
                        k--;
                    k--;
                    
                }           
                                
                    
                
            }
            
        }
        return ans;
    }
}