//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {
            int n;
            n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<ArrayList<Integer>> ans = obj.printUniqueSubsets(nums);
            Collections.sort(ans, new Comparator<ArrayList<Integer>>() {
                @Override   public int compare(ArrayList<Integer> a,
                                             ArrayList<Integer> b) {
                    int al = a.size();
                    int bl = b.size();
                    int min = Math.min(al, bl);
                    for (int i = 0; i < min; i++) {
                        if (a.get(i) < b.get(i))
                            return -1;
                        else if (a.get(i) > b.get(i))
                            return 1;
                    }
                    if (al < bl)
                        return -1;
                    else if (al > bl)
                        return 1;
                    return -1;
                }
            });
            System.out.print("[ ");
            for (int i = 0; i < ans.size(); i++) {
                System.out.print("[ ");
                for (int j = 0; j < ans.get(i).size(); j++)
                    System.out.print(ans.get(i).get(j) + " ");
                System.out.print("]");
            }
            System.out.println(" ]");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    
     static ArrayList<ArrayList<Integer>>  mainList;
     
    public static ArrayList<ArrayList<Integer>> printUniqueSubsets(int[] nums) {
         mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        combination(nums,0,list);
        
        
        
         Collections.sort(mainList, (o1, o2) -> {
                int m = Math.min(o1.size(), o2.size());
                
                for (int i = 0; i < m; i++) {
                    if(i==o1.size() || i==o2.size()) return o1.size()-o2.size();
                    
                    if (o1.get(i) == o2.get(i))  continue;
                    else return o1.get(i) - o2.get(i);
                    
                }
                return o1.size()-o2.size();
            });
        
        return mainList;
    }
    
    public static void combination(int[] nums,int i,ArrayList<Integer> list){
        
        if(i == nums.length){
            mainList.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        combination(nums,i+1,list);
        list.remove(list.size()-1);
        while(i>nums.length-1 && nums[i]==nums[i+1]) i++;
        combination(nums,i+1,list);
        
        
       
    }
}