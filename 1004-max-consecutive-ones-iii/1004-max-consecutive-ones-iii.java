class Solution {
    public int longestOnes(int[] arr, int k) {
        int n = arr.length;
        int i=0;
        int count=0, ans =0;
        for(int j=0; j<n; j++){
            if(arr[j]==0)
                count++;
            while(count>k){
                if(arr[i]==0)
                    count--;
                i++;
               
            }
            ans = Math.max(ans, j-i+1);
        }
        return ans;
    }
}