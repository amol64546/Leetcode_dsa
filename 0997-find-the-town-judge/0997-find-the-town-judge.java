class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] count = new int[n+1];
        int judge=-1;
        
        
        for(int[] arr: trust){
            count[arr[0]]=-1;
            count[arr[1]]++;
        }
        
        for(int i=1; i<n+1; i++){
            if(count[i]==(n-1)){
                judge=i;
                break;
            }
                
        }
        return judge;
    }
}