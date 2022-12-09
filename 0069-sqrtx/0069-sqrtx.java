class Solution {
    public int mySqrt(int x) {
        if(x==0) return x;
        int l = 1, r = x/2;
        while(true){
            int mid = l+ (r-l)/2;
            if(mid==x/mid){
                return mid;
            }
            else if(mid<x/mid){              
                if((mid+1)>x/(mid+1)){
                    return mid;
                }else{
                    l = mid+1;
                }
            }else{
                r = mid-1;
            }
                
        }
        
    }
}