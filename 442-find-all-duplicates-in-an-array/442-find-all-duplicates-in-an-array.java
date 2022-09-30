class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        HashSet<Integer> set= new HashSet<>();
        int n = arr.length;
                Arrays.sort(arr);
                 for(int i=0; i<n-1; i++){
                    if(arr[i]==arr[i+1])
                        set.add(arr[i]);
                }  
        
               List list = new ArrayList<>();
                Iterator it = set.iterator();
                while(it.hasNext()){      
                        list.add(it.next());                        
                }
                Collections.sort(list);
        return list;
                 
    }
}