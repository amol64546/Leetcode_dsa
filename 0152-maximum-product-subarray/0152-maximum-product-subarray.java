class Solution {
    public int maxProduct(int[] arr) {
        int n = arr.length;
        int max = arr[0], min=arr[0], res=arr[0];
        for(int i=1; i<n; i++){
          int  x = Math.max(arr[i],Math.max(max*arr[i],min*arr[i]));
               min = Math.min(arr[i],Math.min(max*arr[i],min*arr[i]));
            
            max = x;
            res = Math.max(max,res);
            
        }
        return res;
    }
}