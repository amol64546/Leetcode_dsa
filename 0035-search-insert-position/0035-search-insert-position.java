class Solution {
    public int searchInsert(int[] arr, int t) {
        int l = 0;
        int r = arr.length-1;
        int ind = -1;
        while(l <= r) {
            int m = l + (r-l)/2;
            if (arr[m] == t)
                return m;
            else if (arr[m] > t) {
                r = m-1;
            } else {
                ind = Math.max(ind, m);
                l = m+1;
            }
        }
        return ind+1;
    }
}