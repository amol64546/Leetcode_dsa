class Solution {
    public void reverseString(char[] arr) {
        
       reverse(arr,0,arr.length-1);   
    }
    
    void reverse(char[] arr, int l, int r){
       if(l>=r) return;
        swap(arr,l,r);
        reverse(arr,l+1,r-1);
    }
    
    void swap(char[] arr, int a, int b){
        char c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
    }
}