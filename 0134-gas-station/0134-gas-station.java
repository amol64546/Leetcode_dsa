class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int start = 0;
        int tank = 0;
        int req = 0;
        
        for(int i=0; i<n; i++){               
            tank = tank + gas[i] - cost[i];
            if(tank<0){
                start = i+1;               
                req += Math.abs(tank);
                 tank = 0;
            }                        
        }
        if(tank>=req) return start;
        return -1;
    }
}