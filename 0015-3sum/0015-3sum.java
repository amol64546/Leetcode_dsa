class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        List ans= new ArrayList();

        
        for(int i=0; i<n; i++){
            int target = -arr[i];
           int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=arr[j]+arr[k];
                if(sum>target)
                    k--;
                else if(sum<target)
                    j++;
                else{
                    List l= new ArrayList(Arrays.asList(arr[i],arr[j],arr[k]));
                    ans.add(l);
                    while(j<k && arr[j]==arr[j+1])
                        j++;
                    j++;
                    while(j<k && arr[k]==arr[k-1])
                        k--;
                    k--;
                    
                }
                while(i<n-2 && arr[i]==arr[i+1])
                       i++;                
                    
                
            }
            
        }
        return ans;
    }
}