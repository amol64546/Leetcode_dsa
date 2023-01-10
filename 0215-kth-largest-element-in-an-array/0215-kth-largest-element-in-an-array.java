class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        return quickSelect(nums,0,nums.length-1,k-1);       
        
    }
    
    public int quickSelect(int[] arr,int l,int h,int k){
        int pivot = arr[h];
        int pi = partition(arr,l,h,pivot);
        
        if(k > pi)
            return quickSelect(arr, pi+1, h, k);
        else if(k < pi)
            return quickSelect(arr, l, pi-1, k);                   
        return arr[pi];        
    }
    
    
     public int partition(int arr[], int low, int high,int pivot)    {
        int i=low, j=low;
        while(i<=high){
            if(arr[i] >= pivot){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++; j++;
            }else{
                i++;
            }
        }
        return j-1;
    } 
}