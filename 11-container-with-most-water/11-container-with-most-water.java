class Solution {
    public int maxArea(int[] arr) {
        int n = arr.length;
        
        int l=0, r=n-1;
        int area, maxArea=0;
        while(l<r){
            int height = Math.min(arr[l],arr[r]);
            int length = r-l;
            area = height * length;
            maxArea = Math.max(area, maxArea);
            
            if(arr[l]<arr[r])
                l++;
            else
                r--;
        }
        return maxArea;
    }
}