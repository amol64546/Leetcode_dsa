//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minSwaps(nums);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends




class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int arr[])
    {
        // Code here
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
             //<value,Index>
             int temp[] = new int[n];
        for(int i=0; i<n; i++){
            temp[i]=arr[i];
            map.put(arr[i],i);
        }
        Arrays.sort(temp);
        int count=0;
        for(int i=0; i<n; i++){
            if(arr[i]!=temp[i]){
                count++;
                //swap
                int k = arr[i];
                arr[i] = arr[map.get(temp[i])];
                arr[map.get(temp[i])] = k;
                // update Index in hashmap 
                map.put(k,map.get(temp[i]));
                map.put(temp[i],i);
                
            }
        }
        return count;
        
    }
}