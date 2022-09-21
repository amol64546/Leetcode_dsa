class Solution {
    public int[] searchRange(int[] arr, int target) {
        int n = arr.length;
        int f= firstPos(arr,n,target);
	    int s = lastPos(arr,n,target);
        
        return new int[] {f,s};
         
    }
    
     int firstPos(int[] arr, int n, int target){
	            int l=0, r=n-1;                
                while(l<=r){
                        int mid = (l+r)/2;
                        if(arr[mid]>target){
                                 r=mid-1;
                        }else if(arr[mid]<target){                               
                                l = mid+1;
                        }else{   // arr[mid]==target
                                if(mid==0 || arr[mid-1]<target){
                                        return mid; 
                                }
                                 r=mid-1;
                        }
                }
	       return -1;
	  }
	  
	    int lastPos(int[] arr, int n, int target){
	              int l=0, r=n-1;                
                while(l<=r){
                        int mid = (l+r)/2;
                        if(arr[mid]>target){
                                 r=mid-1;
                        }else if(arr[mid]<target){                               
                                l = mid+1;
                        }else{   // arr[mid]==target
                                if(mid==n-1 || arr[mid+1]>target){
                                        return mid; 
                                }
                              l = mid+1;
                        }
                }
	        return -1;
	  }
}