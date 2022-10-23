class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        // isPrime[0]=false;
        // isPrime[1]=false;
        for(int i=2; i*i<=n; i++){
            for(int j=2*i; j<=n; j+=i){
                isPrime[j] = false;
            }
        }
        int count=0;
         for(int i=2; i<n; i++){
             if(isPrime[i]==true)
                 count++;
         }
        return count;
    }
}