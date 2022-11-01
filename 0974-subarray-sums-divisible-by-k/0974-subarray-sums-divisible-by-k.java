class Solution {
    public int subarraysDivByK(int[] arr, int k) {
        
       int[] remFreq = new int[k];
        
        int sum = 0,rem=0, count = 0;
         remFreq[0] = 1;
        for (int i : arr) {
            sum += i%k+k;
            rem = sum%k;  
            
            count += remFreq[rem]++;
        }
        
        return count;
             
    }
}