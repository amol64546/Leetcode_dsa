class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
         int index = 0;
        int count=1;
        for(int i=1; i<n; i++){
            
            if(arr[i]==arr[index])
                count++;
            else
                count--;
            
            if(count==0){
                index = i;
                count=1;
            }
                
        }
        
        count=0;
         for(int i=0; i<n; i++){
             if(arr[i]==arr[index])
                 count++;
         }
        System.out.print(count);
        if(count>(n/2))
            return arr[index];
        return 0;
    }
}