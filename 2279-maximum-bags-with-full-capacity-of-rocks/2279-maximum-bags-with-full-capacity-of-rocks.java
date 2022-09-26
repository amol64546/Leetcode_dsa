class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        
        int n = capacity.length;
        for(int i=0; i<n; i++){
             capacity[i] -=  rocks[i];
        }
        
        Arrays.sort(capacity);
        
        int count=0, sum=0;
        for(int i=0; i<n; i++){
             sum+= capacity[i];
             if(sum<=additionalRocks)
                 count++;
            else
                break;
        }
        return count;
       
    }
}