class Solution {
    
    public boolean canOperate(int[] batteries, long ans, int n){
        long min=0, reqMin = ans*n;        
        for(int val: batteries)
            min += (val<ans) ? val : ans;        
        return (min>=reqMin) ? true : false;
    }
    
    public long maxRunTime(int n, int[] batteries) {        
        long sum = 0;        
        for(int val: batteries){
            sum += val;
        }       
        long l=0, r=sum/n;
        long ans = 0;        
        while(l<=r){
            long mid = l + (r-l)/2;
            
            if(canOperate(batteries,mid,n)){
                ans = mid;
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return ans;
    }
}