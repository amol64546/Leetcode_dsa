class Solution {
    public int subarraysDivByK(int[] arr, int k) {
        
       int[] remFreq = new int[k];
        remFreq[0] = 1;
        int sum = 0, count = 0;
        for (int i : arr) {
            sum = (sum + i % k + k) % k;
            count += remFreq[sum]++;
        }
        return count;
             
    }
}