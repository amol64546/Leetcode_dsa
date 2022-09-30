class Solution {
    public List<Integer> findDuplicates(int[] arr) {
      // when find a number i, flip the number at position i-1 to negative. 
      // if the number at position i-1 is already negative, i is the number that occurs twice.
        
       List list = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++) {            
            int index = Math.abs(arr[i])-1;            
            if (arr[index] < 0)
                list.add(Math.abs(index+1));
            
            arr[index] = -arr[index];
        }
        return list;
                 
    }
}