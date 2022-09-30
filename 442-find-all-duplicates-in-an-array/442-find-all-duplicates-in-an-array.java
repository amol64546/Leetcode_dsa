class Solution {
    public List<Integer> findDuplicates(int[] arr) {
      // when find a number i, flip the number at position i-1 to negative. 
      // if the number at position i-1 is already negative, i is the number that occurs twice.
        
       List list = new ArrayList<Integer>();
        int n = arr.length;
        
        for(int i = 0;i<n;i++){
            int val = Math.abs(arr[i]);
            
            //logic for checking val is duplicate or not
            if(arr[val - 1] < 0) list.add(val);
            
            //if val is not duplicate , mark it visited now
            else arr[val - 1] *= - 1;
        }
        
        return list;
                 
    }
}