class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        Integer[] nums = new Integer[arr.length];
        for(int i=0; i<n; i++)
            nums[i] = Integer.valueOf(arr[i]);
        
        Arrays.sort(nums, new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                if(Integer.bitCount(a)==Integer.bitCount(b))
                    return a-b;
                return Integer.bitCount(a)-Integer.bitCount(b);
            }
        });
                
        
        for(int i=0; i<n; i++)
            arr[i] = nums[i];
        
        return arr;
    }
}