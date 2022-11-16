class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
         int ans = 0;
        int count=0;
        
        for(int i: arr){
            if(count==0)  ans = i;
            if(i==ans)    count++;
            else    count--;
                       
        }
        return ans;
        
        
    }
}