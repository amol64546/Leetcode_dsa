class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        
        int extra = 0, start=0;
        int req  = 0;
        
        for(int i=0; i<n; i++){
            extra += gas[i] - cost[i];
            if(extra<0){
                start = i+1;
                req += extra;
                extra = 0;
            }
        }
        if(extra+req >=0){
            return start;
        }
        return -1;
    }
}