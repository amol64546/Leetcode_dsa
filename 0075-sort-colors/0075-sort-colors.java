class Solution {
    public void sortColors(int[] arr) {
      
        int count0=0, count1=0, count2=0;
        for(int i:arr){
            if(i==0) count0++;
            else if(i==1) count1++;
            else count2++;
        }
        for(int i=0; i<arr.length; i++){
            if(i<count0) arr[i]=0;
            else if(i<count0+count1) arr[i]=1;
            else arr[i]=2;
                
            
        }
    }
}
    
 
