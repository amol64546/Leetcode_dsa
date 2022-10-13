class Solution {
    public void print(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    } 
    public void sortColors(int[] nums) {
        print(nums);
        int l=0, r=nums.length-1;
        int i=0;
        while(i<=r){
           if(nums[i]==0){              
               int temp = nums[i];
                nums[i] = nums[l];
                nums[l] = temp;                
               l++;
               
               // sure it will be 1 at i after swapping
             
               print(nums);
           }
           
           if(nums[i]==2){                
                int temp = nums[i];
                nums[i] = nums[r];
                 nums[r] = temp;              
               r--;  
               i--;
               print(nums);
                // not sure which will be at i after swapping
           }
           
           i++;
         
           
        }
        print(nums);
    }
}
    
 
