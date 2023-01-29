class Solution {
    public int maxProduct(int[] arr) {
        int n = arr.length;
        int max = arr[0], min=arr[0], res=arr[0];
        for(int i=1; i<n; i++){
            int maxProd = max*arr[i];
            int minProd = min*arr[i];
            max = Math.max(arr[i],Math.max(maxProd,minProd));
            min = Math.min(arr[i],Math.min(maxProd,minProd));                      
            res = Math.max(max,res);                                                                         
        }
        return res;
    }
}