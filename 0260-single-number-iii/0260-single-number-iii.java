class Solution {    
    public int[] singleNumber(int[] arr) {
        int diff = 0;
        for (int i : arr) 
            diff ^= i;         
        
        // pick one bit as flag
        int bitFlag = (diff & (~ (diff - 1)));
        print(bitFlag);
        
        int[] res = new int[2];
        for (int i : arr) {
            if ((i & bitFlag) == 0) 
                res[0] ^= i;
             else 
                res[1] ^= i;            
        }
        return res;
    }
    
    public void print(int dec){
         int binary=0, i=1;
        while(dec>0){
            binary += (dec%2) * i;
            dec/=2;
            i*=10;            
        }
        System.out.print(binary);
    }
}